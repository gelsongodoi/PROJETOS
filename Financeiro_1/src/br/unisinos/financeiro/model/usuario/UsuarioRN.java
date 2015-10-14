package br.unisinos.financeiro.model.usuario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unisinos.financeiro.model.categoria.CategoriaRN;
import br.unisinos.financeiro.util.DAOFactory;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN() {
		this.usuarioDAO = DAOFactory.criaUsuarioDAO();
	}
	
	public Usuario carregar(Integer codigo) {
		return this.usuarioDAO.carregar(codigo);
	}
	
	public void salvar(Usuario usuario) {
		Integer codigo = usuario.getCodigo();
		if (codigo == null || codigo == 0) {
			usuario.getPermissao().add("ROLE_USUARIO");
			this.usuarioDAO.salvar(usuario);
			
			// Cria estrutura basica de categorias
			CategoriaRN categoriaRN = new CategoriaRN();
			categoriaRN.salvarEstruturaPadrao(usuario);
			
		} else {
			this.usuarioDAO.atualizar(usuario);
		}
	}

	public List<Usuario> listar() {
		return this.usuarioDAO.listar();
	}

	public Usuario buscarPorLogin(String login) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("login", login);
		return this.usuarioDAO.pesqParam(params);
	}

	public void excluir(Usuario usuario) {
		// remover as categorias do usuario
		CategoriaRN categoriaRN = new CategoriaRN();
		categoriaRN.excluir(usuario);
		
		// remove o usuario
		this.usuarioDAO.excluir(usuario);
	}
	
}














