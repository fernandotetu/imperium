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
 * Representa o histórico de movimentações de um dado item do patrimônio
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 8:58:44 PM
 */
@Entity
public class Historico implements IEntidade {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idHistorico;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataMovimentacao;
	@ManyToOne
	@JoinColumn(name = "idPatrimonio", nullable =  false)
	private Patrimonio patrimonio;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
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
