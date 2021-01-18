package br.edu.iffar.imperium.modelo.dao;
/**
 * <p>
 * Classe utilitária que retorma a fabrida de DAO, o qual pode variar
 * conforme a abordagem de persistência
* </p>
*
* @author Prof. Fernando
* @since Jan 12, 2021 8:09:34 PM
*/
public class FabricaDAO {
	// representaa a fabrica de DAO
	private static IFabricaDAO fabrica;
	
	
	/**
	 * <p>
	 * Retorna a fabrica de DAO
	 * </p>
	 */
	public static IFabricaDAO getFabrica() {
		if( fabrica != null ) {
			return fabrica;
		}else {
			// lanca excecao porque a fabrica nao foi definida
			String msg = "Fabrica de DAO não inicializada! ";
			msg += " Chame o Método FabricaDAO.registraFabrica()";
			throw new RuntimeException(msg); 
		
		}
	}
	
	/**
	 * <p>
	 * Permite definir un objeto que implmenta a interface {@link s}
	 * 
	 * @param fabricaDAO implementacao da fabrica
	 */
	public static void registraFabrica( IFabricaDAO fabricaDAO ) {
		fabrica = fabricaDAO;
	}
	
}


