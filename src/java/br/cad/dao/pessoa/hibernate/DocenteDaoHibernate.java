package br.cad.dao.pessoa.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.pessoa.DocenteDao;
import br.cad.model.pessoa.Aluno;
import br.cad.model.pessoa.Docente;
import br.cad.model.system.Usuario;

/**
 * Implementacao do DocenteDao em Hibernate
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
	
	@Override
	public Aluno findByUsuario(Usuario usuario) {
		return null;
	}
}
