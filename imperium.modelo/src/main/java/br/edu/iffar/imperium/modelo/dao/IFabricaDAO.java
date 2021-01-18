package br.edu.iffar.imperium.modelo.dao;

import br.edu.iffar.imperium.modelo.entidade.IEntidade;

/**
 * <p>
 * Define o comportamento de uma fabrica de DAO
 * </p>
 *
 * @author Prof. Fernando
 * @since Jan 12, 2021 8:10:47 PM
 */
public interface IFabricaDAO {
	
	/**
	 * < p>
	 * A partir de uma classe de entidade retornar uma implementação di
	 * padrão, por exemplo, um objeto que implementa o padrão DAO
	 * com hibernermate
	 * </p>
	 */
	public IDAO criarDAO(Class<? extends IEntidade> classeEntidade);

}
