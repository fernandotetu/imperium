package br.edu.iffar.imperium.modelo.dao;

import java.util.List;

import br.edu.iffar.imperium.modelo.entidade.IEntidade;
import br.edu.iffar.imperium.modelo.entidade.Patrimonio;

/**
 * <p>
 *  Especificação de todos os comportamentos de persistência 
 *  que são comuns a todas as entidades
 *  
* </p>
* @author Professor
* @since Dec 15, 2020 9:23:48 PM
*/

public interface IDAO {
	/**
	 * <p>
	 * Gravar ou atualiza uma entidade
	 * </p>
	 * 
	 * @param item a ser gravado/atualizado
	 */
	public void gravar(IEntidade entidade);

	/**
	 * <p>
	 * exclui uma entidade
	 * </p>
	 * 
	 * @param item a ser removido
	 */
	public void remover(IEntidade entidade);

	/**
	 * <p>
	 * Retorna todos os itens de determinada entidade
	 * </p>
	 * 
	 * @return Lista com todas as entidades
	 * 
	 */
	public List<IEntidade> buscarTodos();

	/**
	 * <p>
	 * Busca uma entidade a partir de sua chave primaria
	 * </p>
	 * 
	 * @return codigo utilizado para busca
	 * 
	 */
	public IEntidade buscaPorID(int id);

}
