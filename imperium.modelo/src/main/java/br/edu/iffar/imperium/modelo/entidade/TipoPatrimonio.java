package br.edu.iffar.imperium.modelo.entidade;

/**
 * <p>
 * Classe que representa um tipo de patrimonio, por exemplo, Informática,
 * veiculos, moveis etc
 * </p>
 * 
 * @author Professor
 * @since 15/12/2020 7:39
 */
public class TipoPatrimonio implements IEntidade{

	private int idTipoPatrimonio;
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
