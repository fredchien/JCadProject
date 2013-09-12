package br.cad.service.system;

import br.cad.model.system.Usuario;
import br.cad.service.Service;

/**
 * 
 * @author Will
 *
 */
public interface UsuarioService extends Service<Usuario> {

	public Usuario login(String usuario, String senha);

}
