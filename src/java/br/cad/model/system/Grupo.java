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
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import br.cad.model.ModelEntity;

/**
 * 
 * @author WilliamRodrigues
 * 
 */

@Entity
@Table(name = "Grupo")
public class Grupo extends ModelEntity implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 1L;

	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	private String nmGrupo;
	private String dsGrupo;
	private List<Acao> acoes = new ArrayList<Acao>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	@Column(length = 24)
	@Size(min = 4, max = 24, message = "O Grupo deve ter entre 4 à 24 caracteres!")
	public String getNmGrupo() {
		return nmGrupo;
	}

	public void setNmGrupo(String nmGrupo) {
		this.nmGrupo = nmGrupo;
	}

	@Column(length = 250)
	public String getDsGrupo() {
		return dsGrupo;
	}

	public void setDsGrupo(String dsGrupo) {
		this.dsGrupo = dsGrupo;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "UsuarioGrupo",
			joinColumns = { @JoinColumn(name = "grupo", referencedColumnName = "id") },
			inverseJoinColumns = { @JoinColumn(name = "usuario", referencedColumnName = "id") })
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "GrupoAcao",
			joinColumns = { @JoinColumn(name = "grupo", referencedColumnName = "id") },
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
	@Transient
	public boolean isTemAcesso(String pagina) {
		for (Acao acao : getAcoes()) {
			for (Recurso recurso : acao.getRecursos()) {
				if (pagina.equals(recurso.getEdPagina())) {
					return true;
				}
			}
		}
		return false;
	}

	@Transient
	public boolean isTemAcesso(String pagina, String cdAcao) {
		for (Acao acao : getAcoes()) {
			for (Recurso recurso : acao.getRecursos()) {
				if (pagina.equals(recurso.getEdPagina())) {
					return true;
				}
			}
		}
		return false;
	}

}
