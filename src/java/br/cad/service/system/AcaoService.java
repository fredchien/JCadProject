package br.cad.service.system;

import java.util.List;

import br.cad.model.system.Acao;
import br.cad.service.Service;

/**
 * 
 * @author Will
 *
 */
public interface AcaoService extends Service<Acao> {
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */

	public List<Acao> findAllUsuario(Long idUsuarioLogado);
}
