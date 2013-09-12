package br.cad.dao.system.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.system.DominioDao;
import br.cad.model.system.Dominio;

/**
 * Implementação do DomionioDao em Hibernate
 * 
 * @author Will
 * @since 1.0
 */
@Repository("dominioDao")
public class DominioDaoHibernate extends AbstractDaoHibernate<Dominio> implements DominioDao {

	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public DominioDaoHibernate() {
		this.setEdPackageModel("com.gns.model.cda.");
		this.setOrderFindAll("order by nmDominio");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	
	@Transactional
	@Override
	public List<Dominio> findAllUsuario(Long idUsuarioLogado) {
		@SuppressWarnings("unchecked")
		List<Dominio> models = getSession().createQuery(
				"Select DISTINCT d from Grupo g JOIN g.acoes a JOIN a.recursos r JOIN r.dominio d JOIN g.usuarios u WHERE u.id = " + idUsuarioLogado
						+ " order by d.ordem").list();
		return models;
	}
}
