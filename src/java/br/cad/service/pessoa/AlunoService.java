package br.cad.service.pessoa;

import br.cad.model.pessoa.Aluno;
import br.cad.service.Service;

/**
 * 
 * @author WilliamRodrigues
 *
 */
public interface AlunoService extends Service<Aluno> {
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	public Aluno loginAluno(String usuario, String senha);
}
