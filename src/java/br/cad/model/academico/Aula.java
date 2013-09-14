package br.cad.model.academico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import utils.DataSistema;
import br.cad.model.ModelEntity;
import Docente;

@Entity
@Table(name = "Aula")
public class Aula extends ModelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Date dataAtualizado;

	private LocalAula localAula;
	private Disciplina disciplina;
	private List<HoraAula> horaAulas = new ArrayList<HoraAula>();

	/*
	 * *****************************************************************************************************************
	 * **************************************************** Construtor *************************************************
	 * *****************************************************************************************************************
	 */

	public Aula(LocalAula localAula, Disciplina disciplina, String/*No type specified*/ docente) {
		super();

		this.dataAtualizado = DataSistema.getDataCorrenteTimestamp();
		this.localAula = localAula;
		this.disciplina = disciplina;
		this.docente = docente;
	}

	public Aula() {
		super();

		this.dataAtualizado = DataSistema.getDataCorrenteTimestamp();
	}

	/*
	 * ******************************************************************************************************************
	 * **************************************************** Gets e Sets *************************************************
	 * ******************************************************************************************************************
	 */
public Date getDataAtualizado() {
   return this.dataAtualizado;
}

public void setDataAtualizado(Date value) {
this.dataAtualizado = value;
}


	@JoinColumn(name = "localAula")
	@NotNull(message = "Local da Aula requerido.")
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	public LocalAula getLocalAula() {
		return localAula;
	}

	public void setLocalAula(LocalAula localAula) {
		this.localAula = localAula;
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

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "aula")
	public List<HoraAula> getHoraAulas() {
		return horaAulas;
	}

	public void setHoraAulas(List<HoraAula> horaAulas) {
		this.horaAulas = horaAulas;
	}

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */

	/**
	 * 
	 * Gerar todas as aulas para a grade pegando a data de inicio e a de fim, <br>
	 * comparar com a cargaHoraria da disciplina e setar a disciplina, <br>
	 * setar o docente para as aulas, <br>
	 * setar dia e horario da aulas
	 * 
	 * @param duracaoHoraAula
	 * @param dtInicio
	 * @param dtFim
	 * @param hrAulaInicio
	 * @param hrAulaFim
	 * @param diaSemana
	 * @param localAula
	 * @param disciplina
	 * @param docente
	 * @return
	 */
	public List<Aula> gerarAulas(Integer duracaoHoraAula, Date dtInicio, Date dtFim, Date hrAulaInicio, Date hrAulaFim, Integer diaSemana, LocalAula localAula, Disciplina disciplina,
			String/*No type specified*/ docente) {

		return new ArrayList<Aula>();
	}

}
