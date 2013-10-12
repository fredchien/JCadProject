package br.cad.service.pessoa;

import br.cad.model.pessoa.Administrador;
import br.cad.service.Service;

/**
 * 
 * @author WilliamRodrigues
 *
 */
public interface AdministradorService extends Service<Administrador> {
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	public Administrador loginAdministrador(String usuario, String senha);
}
