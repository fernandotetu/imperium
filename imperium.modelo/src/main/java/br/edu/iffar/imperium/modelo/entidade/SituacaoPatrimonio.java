package br.edu.iffar.imperium.modelo.entidade;

/**
 * <p>
 * A situação refere-se ao estado do patrimônio, pode ser novo, em manutenção,
 * com defeito etc
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:48:55 PM
 */

public class SituacaoPatrimonio  implements IEntidade{

	private int idSituacaoPatrimonio;
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
