package br.cad.dao.pessoa.hibernate;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.pessoa.DocenteDao;
import br.cad.model.pessoa.Docente;

/**
 * Implementação do AlunoDao em Hibernate
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
