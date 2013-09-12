package br.cad.dao.system.hibernate;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import utils.MD5;
import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.system.UsuarioDao;
import br.cad.model.system.Usuario;

/**
 * Implementacao do UsuarioDao em Hibernate
 * 
 * @author Will
 * @since 1.0
 */
@Repository("usuarioDao")
public class UsuarioDaoHibernate extends AbstractDaoHibernate<Usuario> implements UsuarioDao {
	
	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public UsuarioDaoHibernate() {
		this.setEdPackageModel("com.gns.model.cda.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	@Transactional
	@Override
	public Usuario login(String nmLogin, String senha) {
		// Cria a consulta de Usuario por id
		Query query = getSession().createQuery("from Usuario where username=:username and senha=:senha");
		// Seta o parametro id
		query.setString("username", nmLogin);
		try {
			query.setString("senha", MD5.encrypt(senha));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Executa a consulta retornando um resultado apenas
		return (Usuario) query.uniqueResult();
	}
}
