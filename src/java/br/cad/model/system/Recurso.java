package br.cad.model.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.cad.model.ModelEntity;

/**
 * 
 * @author WilliamRodrigues
 * 
 */

@Entity
@Table(name = "Recurso")
public class Recurso extends ModelEntity implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 1L;

	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	private String nmRecurso;
	private String edPagina;
	private String icon;
	private Dominio dominio;
	private List<Acao> acoes = new ArrayList<Acao>();

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	public String getNmRecurso() {
		return nmRecurso;
	}

	public void setNmRecurso(String nmRecurso) {
		this.nmRecurso = nmRecurso;
	}

	public String getEdPagina() {
		return edPagina;
	}

	public void setEdPagina(String edPagina) {
		this.edPagina = edPagina;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dominio")
	public Dominio getDominio() {
		return dominio;
	}

	public void setDominio(Dominio dominio) {
		this.dominio = dominio;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "AcaoRecurso",
			joinColumns = { @JoinColumn(name = "recurso", referencedColumnName = "id") },
			inverseJoinColumns = { @JoinColumn(name = "acao", referencedColumnName = "id") })
	public List<Acao> getAcoes() {
		return acoes;
	}

	public void setAcoes(List<Acao> acoes) {
		this.acoes = acoes;
	}

	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */

}
