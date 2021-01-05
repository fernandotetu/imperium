package br.edu.iffar.imperium.modelo.entidade;

import java.util.Date;

/**
 * <p>
 * Representa um objeto da organização
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:51:43 PM
 */

public class Patrimonio implements IEntidade {

	private int idPatrimonio;
	private String descricao;
	private double valorCompra;
	// quantidade do item
	private int quantidade;
	private Date dataCompra;
	private TipoPatrimonio tipoPatrimonio;
	private SituacaoPatrimonio situacaoPatrimonio;

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getIdPatrimonio() {
		return idPatrimonio;
	}

	public void setIdPatrimonio(int idPatrimonio) {
		this.idPatrimonio = idPatrimonio;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoPatrimonio getTipoPatrimonio() {
		return tipoPatrimonio;
	}

	public void setTipoPatrimonio(TipoPatrimonio tipoPatrimonio) {
		this.tipoPatrimonio = tipoPatrimonio;
	}

	public SituacaoPatrimonio getSituacaoPatrimonio() {
		return situacaoPatrimonio;
	}

	public void setSituacaoPatrimonio(SituacaoPatrimonio situacaoPatrimonio) {
		this.situacaoPatrimonio = situacaoPatrimonio;
	}

}
