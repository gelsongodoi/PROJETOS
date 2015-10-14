package br.unisinos.financeiro.model.categoria;

import java.util.List;

import br.unisinos.financeiro.model.usuario.Usuario;
import br.unisinos.financeiro.util.DAOFactory;

public class CategoriaRN {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaRN() {
		this.categoriaDAO = DAOFactory.criarCategoriaDAO();
	}
	
	public void salvarEstruturaPadrao(Usuario usuario) {
		Categoria despesas = new Categoria(null, usuario, "Despesas", -1);
		// salva nodo 01
		despesas = this.categoriaDAO.salvar(despesas);
		
		this.categoriaDAO.salvar(new Categoria(despesas, usuario, "Moradia", -1));
		this.categoriaDAO.salvar(new Categoria(despesas, usuario, "Alimentação", -1));
		this.categoriaDAO.salvar(new Categoria(despesas, usuario, "Deslocamento", -1));
		this.categoriaDAO.salvar(new Categoria(despesas, usuario, "Saúde", -1));
		this.categoriaDAO.salvar(new Categoria(despesas, usuario, "Lazer", -1));
		
		Categoria receitas = new Categoria(null, usuario, "Receitas", 1);
		// salva nodo 02
		receitas = this.categoriaDAO.salvar(receitas);
		
		this.categoriaDAO.salvar(new Categoria(receitas, usuario, "Salário", 1));
		this.categoriaDAO.salvar(new Categoria(receitas, usuario, "Restituição", 1));
		this.categoriaDAO.salvar(new Categoria(receitas, usuario, "Rendimentos Extras", 1));
		
	}

	public Categoria carregar(Integer codigo) {
		return this.categoriaDAO.carregar(codigo);
	}

	public void salvar(Categoria categoria) {
		
		Categoria pai = categoria.getPai();
		
		if (pai == null) {
			String msg = "A categoria " + categoria.getDescricao() + " deve ter um pai definido.";
			throw new IllegalArgumentException(msg);
		}
		
//		boolean mudouFator = pai.getFator() != categoria.getFator();
		
		categoria.setFator(pai.getFator());
		categoria = this.categoriaDAO.salvar(categoria);
		
//		if (mudouFator) {
//			categoria = this.carregar(categoria.getCodigo());
//			this.reaplicarFator
//		}
		
	}

	public void excluir(Categoria categoria) {
		this.categoriaDAO.excluir(categoria);
	}

	public List<Categoria> listar(Usuario usuario) {
		return this.categoriaDAO.listCategoriasUsuario(usuario);
	}

	public void excluir(Usuario usuario) {
		List<Categoria> lista = this.listar(usuario);
		for (Categoria categoria : lista) {
			this.categoriaDAO.excluir(categoria);
		}
	}

}










