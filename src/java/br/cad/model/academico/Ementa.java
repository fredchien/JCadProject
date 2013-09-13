package br.cad.model.academico;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.cad.model.ModelEntity;

@Entity
@Table(name = "Ementa")
public class Ementa extends ModelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * *****************************************************************************************************************
	 * ************************************************** Atributos ****************************************************
	 * *****************************************************************************************************************
	 */

	private String arquivo;
	private Disciplina disciplina;
	private MatrizCurricular matrizCurricular;

	/*
	 * ******************************************************************************************************************
	 * **************************************************** Gets e Sets *************************************************
	 * ******************************************************************************************************************
	 */

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	@JoinColumn(name = "disciplina")
	@NotNull(message = "Disciplina requerida.")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	@JoinColumn(name = "matrizCurricular")
	@NotNull(message = "Matriz Curricular requerida.")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public MatrizCurricular getMatrizCurricular() {
		return matrizCurricular;
	}

	public void setMatrizCurricular(MatrizCurricular matrizCurricular) {
		this.matrizCurricular = matrizCurricular;
	}

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */

}
