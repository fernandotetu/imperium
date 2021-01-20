package br.edu.iffar.imperium.visao.web.config;

import javax.enterprise.event.Observes;

import br.com.caelum.vraptor.events.VRaptorInitialized;
import br.edu.iffar.imperium.dao.hibernate.HibernateDAO;
import br.edu.iffar.imperium.modelo.dao.FabricaDAO;

/**
 * <p>
 * Classe que configura o projeto web
* </p>
*
* @author Prof. Fernando
* @since Jan 19, 2021 8:07:47 PM
*/
public class ConfiguraProjeto {

	
	/**
	 * Define o modelo de persistencia ao iniciar o servidor
	 */
	public void inicializar(@Observes VRaptorInitialized ini) {
		// essa é a unica linha que precisa ser moficada
		// quando nos trocamos toda a persistencia
		FabricaDAO.registraFabrica(new HibernateDAO()); 
		System.out.println("Modelo de persistencia definido!");

	}
	
}
