package br.cad.dao.system.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.system.GrupoDao;
import br.cad.model.system.Grupo;

/**
 * Implementação do GrupoDao em Hibernate
 * @author Will
 * @since 1.0
 */
@Repository("grupoDao")
public class GrupoDaoHibernate extends AbstractDaoHibernate<Grupo> implements GrupoDao {
	
	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public GrupoDaoHibernate() {
		this.setEdPackageModel("com.gns.model.cda.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
}
