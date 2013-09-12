package br.cad.service.system.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.cad.dao.system.RecursoDao;
import br.cad.model.system.Recurso;
import br.cad.service.impl.AbstractService;
import br.cad.service.system.RecursoService;

/**
 * 
 * @author Will
 * 
 */
@Service("recursoService")
public class RecursoServiceImpl extends AbstractService<Recurso, RecursoDao> implements RecursoService {

	@Override
	public List<Recurso> findAllUsuario(Long idUsuario) {
		return dao.findAllUsuario(idUsuario);
	}
}
