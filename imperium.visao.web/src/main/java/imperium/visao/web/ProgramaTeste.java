package imperium.visao.web;

import br.edu.iffar.imperium.controle.UsuarioLogic;
import br.edu.iffar.imperium.dao.hibernate.HibernateDAO;
import br.edu.iffar.imperium.modelo.dao.FabricaDAO;
import br.edu.iffar.imperium.modelo.entidade.Usuario;

public class ProgramaTeste {

	
	public static void main(String[] args) {
		// essa é a unica linha que precisa ser moficada
		// quando nos trocamos toda a persistencia
		FabricaDAO.registraFabrica(new HibernateDAO()); 
		
		
		Usuario usu = new Usuario();
		usu.setLogin("Logica");
		usu.setNome("Camada de logica");
		usu.setSenha("123");
		
		
		UsuarioLogic logica = new UsuarioLogic();
		logica.gravar(usu);
	}
}
