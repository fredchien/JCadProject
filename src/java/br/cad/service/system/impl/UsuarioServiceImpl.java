package br.cad.service.system.impl;

import org.springframework.stereotype.Service;

import br.cad.dao.system.UsuarioDao;
import br.cad.model.system.Usuario;
import br.cad.service.impl.AbstractService;
import br.cad.service.system.UsuarioService;

/**
 * 
 * @author Will
 * 
 */
@Service("usuarioService")
public class UsuarioServiceImpl extends AbstractService<Usuario, UsuarioDao> implements UsuarioService {

	public Usuario login(String usuario, String senha) {
		return dao.login(usuario, senha);
	}
}
