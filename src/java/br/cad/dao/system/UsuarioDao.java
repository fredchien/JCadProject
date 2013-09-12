package br.cad.dao.system;

import br.cad.dao.Dao;
import br.cad.model.system.Usuario;

/**
 * Definição de Dao de Usuário
 * 
 * @author Will
 * @since 1.0
 */
public interface UsuarioDao extends Dao<Usuario> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	
	/**
	 * Login do Usuario
	 * @param usuario
	 * @param senha
	 * @return Usuario
	 */
	public Usuario login(String usuario, String senha);
}
