package br.cad.service.pessoa.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.cad.dao.pessoa.PessoaPapelDao;
import br.cad.model.pessoa.PessoaPapel;
import br.cad.service.impl.AbstractService;
import br.cad.service.pessoa.PessoaPapelService;
import br.cad.service.system.UsuarioService;

/** 
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 *
 * @param <PESSOA>
 * @param <PESSOADAO>
 */
public class PessoaPapelServiceImpl<PESSOA extends PessoaPapel, PESSOADAO extends PessoaPapelDao<PESSOA>> extends AbstractService<PESSOA, PESSOADAO> implements PessoaPapelService<PESSOA> {

	private PESSOADAO dao;
	
	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Atributos****************************************************
	 * *******************************************************************************************************************
	 */

	private UsuarioService usuarioService;

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** GETS E SETS *************************************************
	 * *******************************************************************************************************************
	 */

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */

	@Override
	public PESSOA login(String usuario, String senha) {
		return null;
	}

	@Override
	public Boolean disablePeople(PESSOA pessoa) {
		return dao.disablePeople(pessoa);
	}
}
