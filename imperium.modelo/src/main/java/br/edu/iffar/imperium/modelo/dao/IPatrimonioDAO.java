package br.edu.iffar.imperium.modelo.dao;

import java.util.List;

import br.edu.iffar.imperium.modelo.entidade.Patrimonio;
import br.edu.iffar.imperium.modelo.entidade.TipoPatrimonio;

/**
 * <p>
 * especifica os comportamentos de persistencia para um item do patrimonio
 * </p>
 * 
 * @author Professor
 * @since Dec 15, 2020 9:06:42 PM
 */

public interface IPatrimonioDAO extends IDAO {
	/**
	 * <p>
	 * Busca todos os itens do patrimonio que sejam de determininado 
	 * tipo
	 * </p>
	 * @param tipo do patrimonio
	 * @return listagem com ospatrimonio compatíveis com tipo informado
	 */
	public List<Patrimonio> buscaPorTipo( TipoPatrimonio tipo );

}
