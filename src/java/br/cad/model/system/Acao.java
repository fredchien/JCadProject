package br.cad.model.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import br.cad.model.ModelEntity;

/**
 * 
 * @author WilliamRodrigues <br> {@link william.rodrigues@live.fae.edu}
 *
 */
@Entity
@Table(name = "Acao")
public class Acao extends ModelEntity implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 1L;

	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	private String nmAcao;
	private String cdAcao;
	private String dsAcao;
	private List<Recurso> recursos = new ArrayList<Recurso>();

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	@Column(length = 50)
	@Size(min = 5, max = 50, message = "O Nome da Ação deve ter entre 5 à 50 caracteres!")
	public void setNmAcao(String nmAcao) {
		this.nmAcao = nmAcao;
	}

	public void setCdAcao(String cdAcao) {
		this.cdAcao = cdAcao;
	}

	@Column(length = 25)
	@Size(min = 5, max = 25, message = "O Código da Ação deve ter entre 5 à 25 caracteres!")
	public String getCdAcao() {
		return cdAcao;
	}

	public String getNmAcao() {
		return nmAcao;
	}

	public String getDsAcao() {
		return dsAcao;
	}

	public void setDsAcao(String dsAcao) {
		this.dsAcao = dsAcao;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "AcaoRecurso",
			joinColumns = { @JoinColumn(name = "acao", referencedColumnName = "id") },
			inverseJoinColumns = { @JoinColumn(name = "recurso", referencedColumnName = "id") })
	public List<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}

	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof Acao) {
			Acao that = (Acao) obj;
			if (that.getId() != null)
				return that.getId().equals(this.getId());
		}
		return false;
	}
}
