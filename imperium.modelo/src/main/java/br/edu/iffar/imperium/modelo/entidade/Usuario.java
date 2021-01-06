package br.edu.iffar.imperium.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Entidade que representa um usuário do sistema
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:56:44 PM
 */
@Entity
public class Usuario implements IEntidade {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int idUsuario;
	
	@Column(length =  150, nullable = false )
	private String nome;
	
	@Column(length =  50, nullable = false )
	private String login;
	
	@Column(length =  150, nullable = false )
	private String senha;

	
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
	
}
