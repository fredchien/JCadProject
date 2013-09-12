package br.cad.model.system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.cad.model.ModelEntity;

/**
 * 
 * @author Will
 * 
 */

@Entity
@Table(name = "Dominio")
public class Dominio extends ModelEntity implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 1L;

	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	private String nmDominio;
	private String dsDominio;
	private Long ordem;
	private String icone;
	private List<Dominio> subDominios = new ArrayList<Dominio>();
	private List<Recurso> recursos = new ArrayList<Recurso>();

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	@NotNull
	@Column(length = 75)
	@Size(min = 4, max = 75, message = "O Nome do Domónio deve ter entre 4 à 75 caracteres!")
	public String getNmDominio() {
		return nmDominio;
	}

	public void setNmDominio(String nmDominio) {
		this.nmDominio = nmDominio;
	}

	@Column(length = 250)
	public String getDsDominio() {
		return dsDominio;
	}

	public void setDsDominio(String dsDominio) {
		this.dsDominio = dsDominio;
	}

	public Long getOrdem() {
		return ordem;
	}

	public void setOrdem(Long ordem) {
		this.ordem = ordem;
	}

	@Column(length = 75)
	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "dominio")
	public List<Dominio> getSubDominios() {
		return subDominios;
	}

	public void setSubDominios(List<Dominio> subDominios) {
		this.subDominios = subDominios;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dominio")
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
}
