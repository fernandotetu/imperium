package br.edu.iffar.imperium.controle;

import br.edu.iffar.imperium.modelo.dao.ISituacaoPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.SituacaoPatrimonio;

/**
 * <p>
 * Regras de negócio para a entidade situação patrimonio
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:49:34 PM
 */
public class SituacaoPatrimonioLogic extends ALogic {

	private ISituacaoPatrimonioDAO dao;

	public SituacaoPatrimonioLogic() {
		super(SituacaoPatrimonio.class);
		this.dao = getDAO();
	}
}
