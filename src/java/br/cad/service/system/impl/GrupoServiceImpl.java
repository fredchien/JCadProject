package br.cad.service.system.impl;

import org.springframework.stereotype.Service;

import br.cad.dao.system.GrupoDao;
import br.cad.model.system.Grupo;
import br.cad.service.impl.AbstractService;
import br.cad.service.system.GrupoService;

/**
 * 
 * @author Will
 *
 */
@Service("grupoService")
public class GrupoServiceImpl extends AbstractService<Grupo, GrupoDao> implements GrupoService {
	
}
