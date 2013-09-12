package br.cad.dao.system;

import java.util.List;

import br.cad.dao.Dao;
import br.cad.model.system.Recurso;

/**
 * Definição de Dao de Recurso
 * 
 * @author Will
 * @since 1.0
 */
public interface RecursoDao extends Dao<Recurso> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	
	public List<Recurso> findAllUsuario(Long idUsuario);
}
