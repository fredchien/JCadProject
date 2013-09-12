package br.cad.service.system;

import java.util.List;

import br.cad.model.system.Dominio;
import br.cad.service.Service;

/**
 * 
 * @author Will
 * 
 */
public interface DominioService extends Service<Dominio> {

	public List<Dominio> findAllUsuario(Long idUsuarioLogado);

}
