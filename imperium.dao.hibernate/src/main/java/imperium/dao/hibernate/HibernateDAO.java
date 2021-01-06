package imperium.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffar.imperium.modelo.dao.IDAO;
import br.edu.iffar.imperium.modelo.entidade.IEntidade;
/**
 * <p>
 * Implementação base para todas as entidades utilizando a api do hibernate
 * </p>
 * @author fernando
 *
 */
public abstract class HibernateDAO implements IDAO {

	private Class<? extends IEntidade> classeEntidade;

	public HibernateDAO(Class<? extends IEntidade> classeEntiodade  ) {
		this.classeEntidade = classeEntiodade;
	}
	
	
	
	public void gravar(IEntidade entidade) {
		// pega una sessao do hibernate
		Session sessao = HibernateHelper.getSession();
		// abre uma transacao
		sessao.beginTransaction();
		// salva ou atualiza uma entidade
		sessao.saveOrUpdate(entidade);
		// comita as mudanças
		sessao.getTransaction().commit();
		// fecha a sessão
		sessao.close();
	}

	public void remover(IEntidade entidade) {
		Session sessao = HibernateHelper.getSession();
		sessao.beginTransaction();
		sessao.delete(entidade);
		sessao.getTransaction().commit();
		sessao.close();
	}

	public List<IEntidade> buscarTodos() {
		Session sessao = HibernateHelper.getSession();
		Criteria c = sessao.createCriteria(this.classeEntidade);
		
		return c.list();
	}

	public IEntidade buscaPorID(int id) {
		Session sessao = HibernateHelper.getSession();
		sessao.load(this.classeEntidade, id);
		return sessao.load(this.classeEntidade, id);
	}

}
