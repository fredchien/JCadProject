package br.cad.dao.system;

import java.util.List;

import br.cad.dao.Dao;
import br.cad.model.system.Acao;

/**
 * Definição de Dao da Ação
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 * @since 1.0
 */
public interface AcaoDao extends Dao<Acao> {
	
	/*
	 ********************************************************************************************************************
	 ************************************************* Metodos Abstratos ************************************************
	 ********************************************************************************************************************
	 */
	
	public List<Acao> findAllUsuario(Long idUsuarioLogado);
}
