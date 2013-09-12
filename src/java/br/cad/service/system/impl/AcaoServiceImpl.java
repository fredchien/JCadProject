package br.cad.service.system.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.cad.dao.system.AcaoDao;
import br.cad.model.system.Acao;
import br.cad.service.impl.AbstractService;
import br.cad.service.system.AcaoService;

/**
 * 
 * @author Will
 * 
 */
@Service("acaoService")
public class AcaoServiceImpl extends AbstractService<Acao, AcaoDao> implements AcaoService {

	@Override
	public List<Acao> findAllUsuario(Long idUsuarioLogado) {
		return dao.findAllUsuario(idUsuarioLogado);
	}

}
