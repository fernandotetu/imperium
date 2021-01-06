package imperium.dao.hibernate;

import br.edu.iffar.imperium.modelo.dao.ISituacaoPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.SituacaoPatrimonio;

/**
 * <p>
 * Implementacao do padrão DAO (comportamentos especificos) para entidade SituacaoPatrimonio
 * </p>
 * @author fernando
 */
public class SituacaoPatrimonioDAO extends HibernateDAO  implements  ISituacaoPatrimonioDAO {

	public SituacaoPatrimonioDAO() {
		super(SituacaoPatrimonio.class);
	}

}
