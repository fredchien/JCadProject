package br.cad.model.academico;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import utils.DataSistema;
import br.cad.model.ModelEntity;

@Entity
@Table(name = "MatrizCurricular")
public class MatrizCurricular extends ModelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * *****************************************************************************************************************
	 * ************************************************** Atributos ****************************************************
	 * *****************************************************************************************************************
	 */

	private Date dataCriacao;
	private Date dataAtualizacao = DataSistema.getDataCorrenteTimestamp();
	private Curso curso;
	private Integer periodo;
	private TipoPeriodo tipoPeriodo;
	
	/*
	 * *****************************************************************************************************************
	 * **************************************************** Construtor *************************************************
	 * *****************************************************************************************************************
	 */

	private MatrizCurricular() {
		this.dataCriacao = DataSistema.getDataCorrenteTimestamp();
	}

	/*
	 * *****************************************************************************************************************
	 * **************************************************** Gets e Sets ************************************************
	 * *****************************************************************************************************************
	 */

	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@JoinColumn(name = "curso")
	@NotNull(message = "Curso requerido.")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Range(max = 2)
	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	@NotNull
	@Column(length = 25)
	@Enumerated(EnumType.STRING)
	public TipoPeriodo getTipoPeriodo() {
		return tipoPeriodo;
	}

	public void setTipoPeriodo(TipoPeriodo tipoPeriodo) {
		this.tipoPeriodo = tipoPeriodo;
	}

	/*
	 * *****************************************************************************************************************
	 * ***************************************************** Metodos ***************************************************
	 * *****************************************************************************************************************
	 */

}
