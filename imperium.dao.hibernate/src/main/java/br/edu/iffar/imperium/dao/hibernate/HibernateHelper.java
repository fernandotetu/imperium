package br.edu.iffar.imperium.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * <p>
 * Classe que retorna uma sessão do hibernate
 * </p>
 * 
 * @author fernando
 *
 */
public class HibernateHelper {

	private static SessionFactory sessionFactory;

	private static void setUp() {
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
																									// from
																									// hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			
			StandardServiceRegistryBuilder.destroy(registry);
			// imprime o erro
			e.printStackTrace();
		}
	}

	/**
	 * <p>
	 * Retorna uma sessão do hibernate, porém, antes de abrir a sessão ele cria a
	 * fabrica somente se esta for nula.
	 * </p>
	 */
	public static Session getSession()  {
		if (sessionFactory == null) {
			setUp();
		}

		return sessionFactory.openSession();
	}

}
