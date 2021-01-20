package br.edu.iffar.imperium.visao.web.controllers;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;
import br.edu.iffar.imperium.controle.UsuarioLogic;
import br.edu.iffar.imperium.modelo.entidade.Usuario;

@Controller
public class UsuarioController {

	@Inject
	private Result rs;
	private UsuarioLogic logica;

	public UsuarioController() {
		this.logica = new UsuarioLogic();
	}

	/**
	 * 
	 * <p>
	 * Grava ou atualiza um usuario
	 * </p>
	 * 
	 */
	public void gravar(Usuario usu) {
		// delega para a camada de logica
		logica.gravar(usu);
	}

	/**
	 * <p>
	 * Criar um formulario para incluir/editar um novo usuario
	 * </p>
	 */
	public void novo() {

	}

	/**
	 * <p>
	 * Criar um formulario para editar um usuario
	 * </p>
	 */
	public void editar(int idUsuario) {
		Usuario u = logica.buscaPorId(idUsuario);
		// joga para tela objeto que veio do banco, utiliznado como base
		// o nome usu, logo, na tela essa informacao deve ser acessada pela 
		// palavra (variavel) usu
		rs.include("usuarioEdicao", u);
		// redireciono para formulario
		rs.redirectTo(this).novo();
		
	}
	
	
	/**
	 * <p>
	 * Lista todos os usuarios na tela
	 * </p>
	 */
	public void listar() {
		// busca todos os usuarios
		List usuarios = logica.buscarTodos();

		// envia a lista de usuarios para tela
		rs.include("usuariolist", usuarios);
	}
	
	public void remover(Usuario usuario) {
		// delego para logica
		this.logica.remover(usuario);
		// redireciona para atela de listagem
		rs.redirectTo(this).listar();
	}
}
