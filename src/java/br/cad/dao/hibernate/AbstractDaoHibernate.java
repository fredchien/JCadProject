package br.cad.dao.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.cad.dao.Dao;
import br.cad.model.Model;

/**
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 *
 * @param <MODEL>
 */
public abstract class AbstractDaoHibernate<MODEL extends Model> implements Dao<MODEL> {
	
	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	protected String modelClassName;
	protected String edPackageModel;
	protected String orderFindAll;
	private SessionFactory sessionFactory;

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	public String getModelClassName() {
		String classname = this.getClass().getSimpleName();
		if (classname.endsWith("DaoHibernate")) {
			return classname.substring(0, classname.length() - 12);
		}
		return null;
	}

	public void setModelClassName(String modelClassName) {
		this.modelClassName = modelClassName;
	}

	public String getEdPackageModel() {
		return edPackageModel;
	}

	public void setEdPackageModel(String edPackageModel) {
		this.edPackageModel = edPackageModel;
	}

	public String getOrderFindAll() {
		return orderFindAll;
	}

	public void setOrderFindAll(String orderFindAll) {
		this.orderFindAll = orderFindAll;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	@SuppressWarnings("unchecked")
	public MODEL getNewModel() {
		try {
			String className = getEdPackageModel() + getModelClassName();
			return (MODEL) Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	public void save(MODEL model) {
		// Salva o usuario
		// Faz as operacao de update e insert
		// update quando o objeto tem id
		// insert quando o objeto nao tem id
		this.getSession().saveOrUpdate(model);
	}

	public void remove(MODEL model) {
		// Remove o usuario da base de dados
		this.getSession().delete(model);
	}

	@SuppressWarnings("unchecked")
	public List<MODEL> findAll() {
		// Busca a sessao do Hibernate getSession()
		// Cria um HQL para buscar os objetos
		// E retorna uma lista com o resultado da consulta HQL
		return getSession().createQuery("from " + getModelClassName() + " " + (orderFindAll == null ? "" : orderFindAll)).list();
	}

	@SuppressWarnings("unchecked")
	public List<MODEL> findAllPropriety(String namePropriety, String valuePropriety) {
		// Busca a sessao do Hibernate getSession()
		// Cria um HQL para buscar objetos pelas pelos paramentros
		// E retorna uma lista com o resultado da consulta HQL
		List<MODEL> models = getSession().createQuery("from " + getModelClassName() + " as model where model." + namePropriety + " like '%" + valuePropriety + "%'").list();
		return models;
	}

	@SuppressWarnings("unchecked")
	public MODEL findById(Long id) {
		// Cria a consulta por id
		Query query = getSession().createQuery("from " + getModelClassName() + " where id=:id");
		// Seta o parametro id
		query.setLong("id", id);
		// Executa a consulta retornando um resultado apenas
		return (MODEL) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public MODEL findByPropriety(String namePropriety, String valuePropriety) {
		// Cria a consulta por valuePropriety com seu tipo
		Query query = getSession().createQuery("from " + getModelClassName() + " where " + namePropriety + "=:valuePropriety");
		// Seta o parametro
		query.setString("valuePropriety", valuePropriety);
		// Executa a consulta retornando um resultado apenas
		return (MODEL) query.uniqueResult();
	}
}
