package br.edu.iffar.imperium.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <p>
 * A situação refere-se ao estado do patrimônio, pode ser novo, em manutenção,
 * com defeito etc
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:48:55 PM
 */
@Entity
public class SituacaoPatrimonio  implements IEntidade{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSituacaoPatrimonio;
	
	@Column(length = 50, nullable = false)
	private String descricao;

	
	public int getIdSituacaoPatrimonio() {
		return idSituacaoPatrimonio;
	}

	public void setIdSituacaoPatrimonio(int idSituacaoPatrimonio) {
		this.idSituacaoPatrimonio = idSituacaoPatrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
