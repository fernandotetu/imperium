package br.edu.iffar.imperium.modelo.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * <p>
 * Representa um objeto da organização
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:51:43 PM
 */
@Entity
public class Patrimonio implements IEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPatrimonio;
	@Column(length = 200, nullable = false)
	private String descricao;
	
	@Column
	private double valorCompra;
	
	@Column
	// quantidade do item
	private int quantidade;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dataCompra;
	
	@ManyToOne
	@JoinColumn(name = "idTipoPatrimonio", nullable = false)
	private TipoPatrimonio tipoPatrimonio;
	
	@ManyToOne
	@JoinColumn(name = "idSituacaoPatrimonio")
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
