package br.edu.iffar.imperium.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * Classe que representa um tipo de patrimonio, por exemplo, Informática,
 * veiculos, moveis etc
 * </p>
 * 
 * @author Professor
 * @since 15/12/2020 7:39
 */
@Entity
public class TipoPatrimonio implements IEntidade{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoPatrimonio;
	
	@Column(length = 40, nullable = false)
	private String descricao;

	
	public int getIdTipoPatrimonio() {
		return idTipoPatrimonio;
	}

	public void setIdTipoPatrimonio(int idTipoPatrimonio) {
		this.idTipoPatrimonio = idTipoPatrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
