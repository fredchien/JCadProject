package br.cad.dao.pessoa;

import br.cad.dao.Dao;
import br.cad.model.pessoa.Aluno;
import br.cad.model.pessoa.Docente;
import br.cad.model.system.Usuario;

/**
 * Definição de Dao de Docente
 * 
 * @author WilliamRodrigues <br> william.rodrigues@live.fae.edu
 * @since 1.0
 */
public interface DocenteDao extends Dao<Docente> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	
	public Aluno findByUsuario(Usuario usuario);
}
