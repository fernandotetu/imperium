package br.edu.iffar.imperium.controle;

import java.util.List;

import br.edu.iffar.imperium.modelo.dao.FabricaDAO;
import br.edu.iffar.imperium.modelo.dao.IDAO;
import br.edu.iffar.imperium.modelo.entidade.IEntidade;

/**
 * <p>
 * Classe genérica que controla as ações de lógica para as entidade
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:51:47 PM
 */
public abstract class ALogic {

	private IDAO dao;

	/**
	 * <p>
	 * construtor que recebe a classe da entidade que será gerenciada
	 * </p>
	 */
	public ALogic(Class<? extends IEntidade> entidade) {
		this.dao = FabricaDAO.getFabrica().criarDAO(entidade);
	}

	/**
	 * <p>
	 * Retorna a instancia do dao que foi criada no construtor da classe. Essa
	 * instancia é um dao especifico para a entidade que foi passada pelo construtor
	 * </p>
	 */
	protected <T extends IDAO> T getDAO() {
		return (T) this.dao;
	}

	public void gravar(IEntidade entidade) {
		this.dao.gravar(entidade);
	}

	public void remover(IEntidade entidade) {
		this.dao.remover(entidade);
	}

	public <T extends IEntidade> T buscaPorId(int id) {
		return (T) this.dao.buscaPorID(id);
	}

	public List buscarTodos() {
		return dao.buscarTodos();
	}
}
