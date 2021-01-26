package br.edu.iffar.imperium.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.iffar.imperium.modelo.dao.IDAO;
import br.edu.iffar.imperium.modelo.dao.IFabricaDAO;
import br.edu.iffar.imperium.modelo.entidade.IEntidade;
/**
 * <p>
 * Implementação base para todas as entidades utilizando a api do hibernate
 * </p>
 * @author fernando
 *
 */
public  class HibernateDAO implements IDAO, IFabricaDAO {

	private Class<? extends IEntidade> classeEntidade;

	public HibernateDAO(Class<? extends IEntidade> classeEntiodade  ) {
		this.classeEntidade = classeEntiodade;
	}
	/**
	 * <p>
	 * Construtor para definicao da fabrica de daos
	 * </p>
	 */
	public HibernateDAO() {
		
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

	
	public IDAO criarDAO(Class<? extends IEntidade> classeEntidade) {
		
		StringBuffer pacote = new StringBuffer();
		// monta o pacote com o nome da classe 
		// para instanciar um objeto do tipo DAO
		pacote.append("br.edu.iffar.imperium.dao.hibernate.");
		// adiciona o nome da classe: entidade + DAO
		pacote.append(classeEntidade.getSimpleName()).append("DAO");
		
		// utilizando reflexao criar o objeto
		try {
			Class classeDAO = Class.forName(pacote.toString());
			return (IDAO) classeDAO.newInstance();
			
		} catch (Exception e) {
			 e.printStackTrace();
			 throw new RuntimeException("Pacote ou nome do DAO invalido: "+ pacote.toString());
		}
		
	}
	
}
