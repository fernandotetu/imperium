package br.edu.iffar.imperium.controle;

import java.util.List;

import br.edu.iffar.imperium.modelo.dao.IPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.Patrimonio;
import br.edu.iffar.imperium.modelo.entidade.Usuario;

/**
 * <p>
 * Regras de negócio para a entidade patrimonio
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:49:34 PM
 */
public class PatrimonioLogic extends ALogic {
	
	private IPatrimonioDAO dao;

	public PatrimonioLogic() {
		super(Patrimonio.class);
		this.dao = getDAO();
	}
}
