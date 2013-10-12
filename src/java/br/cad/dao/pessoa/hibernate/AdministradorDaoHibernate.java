package br.cad.dao.pessoa.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.pessoa.AdministradorDao;
import br.cad.model.pessoa.Administrador;
import br.cad.model.system.Usuario;

/**
 * Implementação do AdministradorDao em Hibernate
 * @author WilliamRodrigues
 * @since 1.0
 */
@Repository("administradorDao")
public class AdministradorDaoHibernate extends AbstractDaoHibernate<Administrador> implements AdministradorDao {

	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public AdministradorDaoHibernate() {
		this.setEdPackageModel("br.cad.model.pessoa.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */

	@Override
	public Administrador findByUsuario(Usuario usuario) {
		return null;
	}
}
