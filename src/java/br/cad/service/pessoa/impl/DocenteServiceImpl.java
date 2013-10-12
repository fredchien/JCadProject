package br.cad.service.pessoa.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cad.dao.pessoa.DocenteDao;
import br.cad.model.pessoa.Docente;
import br.cad.service.impl.AbstractService;
import br.cad.service.pessoa.DocenteService;
import br.cad.service.system.UsuarioService;

/**
 * 
 * @author WilliamRodrigues
 * 
 */
@Service("docenteService")
public class DocenteServiceImpl extends AbstractService<Docente, DocenteDao> implements DocenteService {
	
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
	public Docente loginDocente(String usuario, String senha) {
		return null;
	}
}
