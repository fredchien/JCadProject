package br.cad.dao.pessoa.hibernate;

import org.springframework.stereotype.Repository;

import br.cad.dao.pessoa.AlunoDao;
import br.cad.model.pessoa.Aluno;

/**
 * Implementação do AlunoDao em Hibernate
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 * @since 1.0
 */
@Repository("alunoDao")
public class AlunoDaoHibernate extends PessoaPapelDaoHibernate<Aluno> implements AlunoDao {

	/*
	 * *****************************************************************************************************************
	 * ************************************************* Construtor ****************************************************
	 * *****************************************************************************************************************
	 */

	public AlunoDaoHibernate() {
		this.setEdPackageModel("br.cad.model.pessoa.");
	}

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */

}
