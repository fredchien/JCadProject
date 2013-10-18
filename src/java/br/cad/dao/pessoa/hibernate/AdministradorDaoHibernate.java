package br.cad.dao.pessoa.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.pessoa.AdministradorDao;
import br.cad.model.pessoa.Administrador;

/**
 * Implementação do AdministradorDao em Hibernate
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 * @since 1.0
 */
@Repository("administradorDao")
public class AdministradorDaoHibernate extends PessoaPapelDaoHibernate<Administrador> implements AdministradorDao {

	/*
	 * *****************************************************************************************************************
	 * ************************************************* Construtor ****************************************************
	 * *****************************************************************************************************************
	 */

	public AdministradorDaoHibernate() {
		this.setEdPackageModel("br.cad.model.pessoa.");
	}

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */

}
