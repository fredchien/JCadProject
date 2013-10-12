package br.cad.dao.pessoa.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.pessoa.DocenteDao;
import br.cad.model.pessoa.Docente;

/**
 * Implementacao do AlunoDao em Hibernate
 * @author WilliamRodrigues
 * @since 1.0
 */
@Repository("docenteDao")
public class DocenteDaoHibernate extends AbstractDaoHibernate<Docente> implements DocenteDao {

	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public DocenteDaoHibernate() {
		this.setEdPackageModel("br.cad.model.pessoa.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
}
