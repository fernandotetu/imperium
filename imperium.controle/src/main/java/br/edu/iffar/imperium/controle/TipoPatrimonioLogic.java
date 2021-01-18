package br.edu.iffar.imperium.controle;

import br.edu.iffar.imperium.modelo.dao.ITipoPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.TipoPatrimonio;

/**
 * <p>
 * Regras de negócio para a entidade tipo patrimonio
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:49:34 PM
 */
public class TipoPatrimonioLogic extends ALogic {

	private ITipoPatrimonioDAO dao;

	public TipoPatrimonioLogic() {
		super(TipoPatrimonio.class);
		this.dao = getDAO();
	}
}
