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
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import utils.MD5;
import br.cad.model.ModelEntity;

/**
 * 
 * @author WilliamRodrigues
 * 
 */

@Entity
@Table(name = "Usuario")
public class Usuario extends ModelEntity implements Serializable {
	/**
	 * SerialVersion
	 */
	private static final long serialVersionUID = 1L;

	/* 
	 ******************************************************************************************************************
	 *************************************************** Atributos ****************************************************
	 ******************************************************************************************************************
	 */
	private String nmUsuario;
	private String userName;
	private String edEmail;
	private String senha;
	private Character ativo;
	private List<Grupo> grupos = new ArrayList<Grupo>();

	/*
	 *******************************************************************************************************************
	 ***************************************************** Gets e Sets *************************************************
	 *******************************************************************************************************************
	 */
	@Column(length = 75)
	@Size(min = 10, max = 75, message = "O Nome Usuario deve ter entre 10 à 75 caracteres!")
	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	@NotNull
	@Column(length = 25, unique = true, nullable = false)
	@Size(min = 4, max = 25, message = "O Nome Usuario deve ter entre 4 à 16 caracteres!")
	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	@Column(length = 50)
	@Size(min = 8, max = 50, message = "O Email deve ter entre 8 à 50 caracteres!")
	public String getEdEmail() {
		return edEmail;
	}

	public void setEdEmail(String edEmail) {
		this.edEmail = edEmail;
	}

	@Column(length = 50)
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setSenhaUsuario(String senha) {
		if (senha != null && senha.trim().length() > 0)
			try {
				setSenha(MD5.encrypt(senha));
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

	@Transient
	@Size(min = 4, max = 16, message = "A senha deve ter entre 4 à 16 caracteres!")
	public String getSenhaUsuario() {
		return null;
	}

	@Valid
	public Character getAtivo() {
		return ativo;
	}

	public void setAtivo(Character ativo) {
		this.ativo = ativo;
	}

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "UsuarioGrupo",
			joinColumns = { @JoinColumn(name = "usuario", referencedColumnName = "id") },
			inverseJoinColumns = { @JoinColumn(name = "grupo", referencedColumnName = "id") })
	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(List<Grupo> grupos) {
		this.grupos = grupos;
	}
	
	/*
	 ********************************************************************************************************************
	 ****************************************************** Metodos *****************************************************
	 ********************************************************************************************************************
	 */
	@Transient
	public boolean isTemAcesso(String pagina, String cdAcao) {
		for (Grupo grupo : getGrupos()) {
			if (grupo.isTemAcesso(pagina, cdAcao)) {
				return true;
			}
		}
		return false;
	}

	@Transient
	public boolean isTemAcesso(String pagina) {
		for (Grupo grupo : getGrupos()) {
			if (grupo.isTemAcesso(pagina)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Verifica se a chave key e valida de acordo com o atributo codigo
	 * 
	 * @return true se for valida e false caso contrario.
	 */
	@Transient
	public boolean checkValidKey(String key) {
		try {
			return key.equals(getUserKey());
		} catch (Exception e) {
		}
		return false;
	}

	/**
	 * Gera uma chave unica para o usuario. Utilizada para entrada automatica no sistema.
	 * 
	 * @return
	 */
	@Transient
	public String getUserKey() {
		try {
			char[] md5 = MD5.encrypt(userName.toLowerCase()).toLowerCase().toCharArray();
			changePosition(md5, 5, 4);
			changePosition(md5, 10, 2);
			changePosition(md5, 3, 12);
			changePosition(md5, 15, 7);
			changePosition(md5, 1, 8);
			changePosition(md5, 20, 8);
			changePosition(md5, 21, 3);
			changePosition(md5, 31, 6);
			changePosition(md5, 30, 28);
			changePosition(md5, 28, 18);
			changePosition(md5, 25, 13);
			return new String(md5);
		} catch (Exception e) {
		}
		return null;
	}

	private void changePosition(char[] ch, int p1, int p2) {
		char aux = ch[p1];
		ch[p1] = ch[p2];
		ch[p2] = aux;
	}
}
