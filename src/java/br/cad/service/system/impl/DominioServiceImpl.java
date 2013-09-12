package br.cad.service.system.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.cad.dao.system.DominioDao;
import br.cad.model.system.Dominio;
import br.cad.service.impl.AbstractService;
import br.cad.service.system.DominioService;

/**
 * 
 * @author Will
 *
 */
@Service("dominioService")
public class DominioServiceImpl extends AbstractService<Dominio, DominioDao> implements DominioService {

	@Override
	public List<Dominio> findAllUsuario(Long idUsuarioLogado) {
		return dao.findAllUsuario(idUsuarioLogado);
	}
	
}
