package br.cad.dao.system.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.system.RecursoDao;
import br.cad.model.system.Recurso;
/**
 * Implementação do RecursoDao em Hibernate
 * 
 * @author Will
 * @since 1.0
 */
@Repository("recursoDao")
public class RecursoDaoHibernate extends AbstractDaoHibernate<Recurso> implements RecursoDao {

	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public RecursoDaoHibernate() {
		this.setEdPackageModel("br.cad.model.system.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	
	@Transactional
	@Override
	public List<Recurso> findAllUsuario(Long idUsuario) {
		@SuppressWarnings("unchecked")
		List<Recurso> models = getSession().createQuery("Select DISTINCT r from Grupo g JOIN g.acoes a JOIN a.recursos r JOIN g.usuarios u WHERE u.id = " + idUsuario + "order by r.nmRecurso").list();
		return models;
	}
}
