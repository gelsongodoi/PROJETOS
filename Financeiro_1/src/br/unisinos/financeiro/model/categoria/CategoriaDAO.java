package br.unisinos.financeiro.model.categoria;

import java.util.List;

import br.unisinos.financeiro.model.dao.DaoGenerico;
import br.unisinos.financeiro.model.usuario.Usuario;

public interface CategoriaDAO extends DaoGenerico<Categoria, Integer> {
	
	public List<Categoria> listCategoriasUsuario(Usuario usuario);

}
