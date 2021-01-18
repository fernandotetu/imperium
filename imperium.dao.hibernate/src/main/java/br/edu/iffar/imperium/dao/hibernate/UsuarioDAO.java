package br.edu.iffar.imperium.dao.hibernate;

import br.edu.iffar.imperium.modelo.dao.IUsuarioDAO;
import br.edu.iffar.imperium.modelo.entidade.Usuario;
/**
 * <p>
 * Implementacao do padrão DAO (comportamentos especificos) para entidade Usuario
 * </p>
 * @author fernando
 */
public class UsuarioDAO extends HibernateDAO  implements  IUsuarioDAO {

	public UsuarioDAO() {
		super(Usuario.class);
	}

}
