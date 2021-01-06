package imperium.dao.hibernate;

import org.hibernate.Session;

import br.edu.iffar.imperium.modelo.entidade.Usuario;

public class Programa {

	
	public static void main(String[] args) throws Exception {
		
		Usuario usu = new Usuario();
		usu.setNome("Professor fernando luis");
		usu.setLogin("professor.poo");
		usu.setSenha("123");
		usu.setIdUsuario(1);
		
		
		// salvar
		Session sessao = HibernateHelper.getSession();
		sessao.beginTransaction();
		sessao.saveOrUpdate(usu);
		sessao.getTransaction().commit();
		sessao.close();
		
		
				
		
	}
	
}
