package br.edu.iffar.imperium.modelo.entidade;

import java.util.Date;

/**
 * <p>
 * Representa o histórico de movimentações de um dado item do patrimônio
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:58:44 PM
 */

public class Historico implements IEntidade {

	private int idHistorico;
	private Date dataMovimentacao;
	private Patrimonio patrimonio;
	// usuario resp pelo patrimonio
	private Usuario usuario;

	public int getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
	}

	public Date getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Date dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Patrimonio getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(Patrimonio patrimonio) {
		this.patrimonio = patrimonio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
