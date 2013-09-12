package br.cad.dao.system.hibernate;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.cad.dao.hibernate.AbstractDaoHibernate;
import br.cad.dao.system.AcaoDao;
import br.cad.model.system.Acao;

/**
 * Implementação do AcaoDao em Hibernate
 * @author Will
 * @since 1.0
 */
@Repository("acaoDao")
public class AcaoDaoHibernate extends AbstractDaoHibernate<Acao> implements AcaoDao {

	/* 
	 ******************************************************************************************************************
	 ************************************************** Construtor ****************************************************
	 ******************************************************************************************************************
	 */
	
	public AcaoDaoHibernate() {
		this.setEdPackageModel("com.gns.model.cda.");
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	
	@Transactional
	@Override
	public List<Acao> findAllUsuario(Long idUsuarioLogado) {
		@SuppressWarnings("unchecked")
		List<Acao> models = getSession().createQuery("Select DISTINCT a from Grupo g JOIN g.acoes a JOIN g.usuarios u WHERE u.id = " + idUsuarioLogado + " order by a.nmAcao").list();
		return models;
	}
}
