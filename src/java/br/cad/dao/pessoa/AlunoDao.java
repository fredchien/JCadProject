package br.cad.dao.pessoa;

import br.cad.dao.Dao;
import br.cad.model.pessoa.Aluno;
import br.cad.model.system.Usuario;

/**
 * Definição de Dao de Aluno
 * 
 * @author Will
 * @since 1.0
 */
public interface AlunoDao extends Dao<Aluno> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	public Aluno findByUsuario(Usuario usuario);
}
