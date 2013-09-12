package br.cad.model.pessoa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.cad.model.ModelEntity;
import br.cad.model.system.Usuario;

/**
 * Classe responsavel pelo papel de cada pessoa tipo Aluno, professor e etc...
 * 
 * @author WilliamRodrigues <br>
 *         william.rodrigues@live.fae.edu
 * 
 */
@MappedSuperclass
public abstract class PessoaPapel extends ModelEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * *****************************************************************************************************************
	 * ************************************************** Atributos ****************************************************
	 * *****************************************************************************************************************
	 */
	private String nomeCompleto;
	private String nomeAbreviado;
	
	/**
	 * Usuario do Sistema
	 */
	private Usuario usuario;

	/*
	 * ******************************************************************************************************************
	 * **************************************************** Gets e Sets *************************************************
	 * ******************************************************************************************************************
	 */

	@NotNull
	@Column(length = 255)
	@Size(min = 5, max = 255, message = "")
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	@Column(length = 75)
	@Size(min = 3, max = 75, message = "")
	public String getNomeAbreviado() {
		return nomeAbreviado;
	}

	public void setNomeAbreviado(String nomeAbreviado) {
		this.nomeAbreviado = nomeAbreviado;
	}

	@NotNull(message = "Usuário deve ser preenchido")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	/*
	 * *******************************************************************************************************************
	 * ***************************************************** Metodos *****************************************************
	 * *******************************************************************************************************************
	 */
}
