package br.unisinos.financeiro.model.categoria;

import java.util.List;

import org.hibernate.Query;

import br.unisinos.financeiro.model.dao.DaoGenericoImp;
import br.unisinos.financeiro.model.usuario.Usuario;

public class CategoriaDAOImpl extends DaoGenericoImp<Categoria, Integer> implements
		CategoriaDAO {
	
	@SuppressWarnings("unchecked")
	public List<Categoria> listCategoriasUsuario(Usuario usuario) {
		String hql = "Select c from Categoria c where c.pai is null and c.usuario = :usuario";
		Query consulta = getSession().createQuery(hql); 
		consulta.setParameter("usuario", usuario);
		List<Categoria> lista = consulta.list();
		return lista;
	}

}
