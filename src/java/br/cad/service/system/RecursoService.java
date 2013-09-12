package br.cad.service.system;

import java.util.List;

import br.cad.model.system.Recurso;
import br.cad.service.Service;

/**
 * 
 * @author Will
 *
 */
public interface RecursoService extends Service<Recurso> {

	public List<Recurso> findAllUsuario(Long idUsuario);
}
