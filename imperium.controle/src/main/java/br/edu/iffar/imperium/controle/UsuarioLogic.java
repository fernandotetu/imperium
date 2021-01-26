package br.edu.iffar.imperium.controle;

import br.edu.iffar.imperium.modelo.dao.IUsuarioDAO;
import br.edu.iffar.imperium.modelo.entidade.Usuario;

/**
 * <p>
 * Classe de lógica para a entidade usuário
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 7:35:12 PM
 */
public class UsuarioLogic extends ALogic {

	private IUsuarioDAO dao;

	public UsuarioLogic() {
		super(Usuario.class);
		this.dao = getDAO();
	}

}
