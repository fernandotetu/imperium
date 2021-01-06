package imperium.dao.hibernate;

import br.edu.iffar.imperium.modelo.dao.ITipoPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.TipoPatrimonio;
/**
 * <p>
 * Implementacao do padrão DAO (comportamentos especificos) para entidade TipoPatrimonio
 * </p>
 * @author fernando
 */
public class TipoPatrimonioDAO extends HibernateDAO  implements  ITipoPatrimonioDAO {

	public TipoPatrimonioDAO() {
		super(TipoPatrimonio.class);
	}

}
