package br.cad.service.pessoa.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cad.dao.pessoa.AdministradorDao;
import br.cad.model.pessoa.Administrador;
import br.cad.service.impl.AbstractService;
import br.cad.service.pessoa.AdministradorService;
import br.cad.service.system.UsuarioService;

/**
 * 
 * @author WilliamRodrigues
 * 
 */
@Service("administradorService")
public class AdministradorServiceImpl extends AbstractService<Administrador, AdministradorDao> implements AdministradorService {
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Atributos****************************************************
	 ********************************************************************************************************************
	 */
	private UsuarioService usuarioService;
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** GETS E SETS *************************************************
	 ********************************************************************************************************************
	 */

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	@Autowired
	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */

	@Override
	public Administrador loginAdministrador(String usuario, String senha) {
		return null;
	}
}
