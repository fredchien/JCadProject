package br.cad.service.pessoa.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.cad.dao.pessoa.AlunoDao;
import br.cad.model.pessoa.Aluno;
import br.cad.service.impl.AbstractService;
import br.cad.service.pessoa.AlunoService;
import br.cad.service.system.UsuarioService;

/**
 * 
 * @author WilliamRodrigues
 * 
 */
@Service("alunoService")
public class AlunoServiceImpl extends AbstractService<Aluno, AlunoDao> implements AlunoService {
	
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
	public Aluno loginAluno(String usuario, String senha) {
		return null;
	}
}
