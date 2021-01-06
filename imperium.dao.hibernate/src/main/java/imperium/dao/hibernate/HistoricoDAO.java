package imperium.dao.hibernate;

import br.edu.iffar.imperium.modelo.dao.IHistoricoDAO;
import br.edu.iffar.imperium.modelo.entidade.Historico;
/**
 * <p>
 * Implementacao do padrão DAO (comportamentos especificos) para entidade Historico
 * </p>
 * @author fernando
 */
public class HistoricoDAO extends HibernateDAO implements IHistoricoDAO {

	public HistoricoDAO() {
		super(Historico.class);
	}

}
