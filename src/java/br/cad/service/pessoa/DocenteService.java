package br.cad.service.pessoa;

import br.cad.model.pessoa.Docente;
import br.cad.service.Service;

/**
 * 
 * @author WilliamRodrigues
 *
 */
public interface DocenteService extends Service<Docente> {
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	public Docente loginDocente(String usuario, String senha);
}
