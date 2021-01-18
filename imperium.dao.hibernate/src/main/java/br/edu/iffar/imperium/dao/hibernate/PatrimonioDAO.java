package br.edu.iffar.imperium.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import br.edu.iffar.imperium.modelo.dao.IPatrimonioDAO;
import br.edu.iffar.imperium.modelo.entidade.Patrimonio;
import br.edu.iffar.imperium.modelo.entidade.TipoPatrimonio;
/**
 * <p>
 * Implementacao do padrão DAO (comportamentos especificos) para entidade Patrimonio
 * </p>
 * @author fernando
 */
public class PatrimonioDAO extends HibernateDAO implements IPatrimonioDAO {

	public PatrimonioDAO() {
		super(Patrimonio.class);
	}

	public List<Patrimonio> buscaPorTipo(TipoPatrimonio tipo) {
		Criteria c = HibernateHelper.getSession().createCriteria(Patrimonio.class);
		
		c.add( Restrictions.eq("tipoPatrimonio", tipo));
		
		return c.list();
	}

	
	
}
