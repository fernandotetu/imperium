package br.edu.iffar.imperium.controle;

import br.edu.iffar.imperium.modelo.dao.IHistoricoDAO;
import br.edu.iffar.imperium.modelo.entidade.Historico;

/**
 * <p>
 * Classe de lógica para a entidade histórico
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:35:12 PM
 */
public class HistoricoLogic extends ALogic {

	private IHistoricoDAO dao;

	public HistoricoLogic() {
		super(Historico.class);
		this.dao = getDAO();
	}

}
