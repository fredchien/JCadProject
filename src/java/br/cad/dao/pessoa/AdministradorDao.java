package br.cad.dao.pessoa;

import br.cad.dao.Dao;
import br.cad.model.pessoa.Administrador;
import br.cad.model.system.Usuario;

/**
 * Definição de Dao de Administrador
 * 
 * @author Will
 * @since 1.0
 */
public interface AdministradorDao extends Dao<Administrador> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	public Administrador findByUsuario(Usuario usuario);
}
