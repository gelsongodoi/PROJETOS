package br.unisinos.financeiro.util;

import br.unisinos.financeiro.model.acao.AcaoDAO;
import br.unisinos.financeiro.model.acao.AcaoDAOImpl;
import br.unisinos.financeiro.model.categoria.CategoriaDAO;
import br.unisinos.financeiro.model.categoria.CategoriaDAOImpl;
import br.unisinos.financeiro.model.conta.ContaDAO;
import br.unisinos.financeiro.model.conta.ContaDAOImpl;
import br.unisinos.financeiro.model.lancamento.LancamentoDAO;
import br.unisinos.financeiro.model.lancamento.LancamentoDAOImpl;
import br.unisinos.financeiro.model.usuario.UsuarioDAO;
import br.unisinos.financeiro.model.usuario.UsuarioDAOImpl;

public class DAOFactory {

	public static UsuarioDAO criaUsuarioDAO() {
		UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return usuarioDAO;
	}

	public static ContaDAO criaContaDAO() {
		ContaDAOImpl contaDAO = new ContaDAOImpl();
		contaDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return contaDAO;
	}

	public static CategoriaDAO criarCategoriaDAO() {
		CategoriaDAOImpl categoriaDAO = new CategoriaDAOImpl();
		categoriaDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return categoriaDAO;
	}

	public static LancamentoDAO criarLancamentoDAO() {
		LancamentoDAOImpl lancamentoDAO = new LancamentoDAOImpl();
		lancamentoDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return lancamentoDAO;
	}

	public static AcaoDAO criaAcaoDAO() {
		AcaoDAOImpl acaoDAO = new AcaoDAOImpl();
		acaoDAO.setSession(HibernateUtil.getSessionFactory()
				.getCurrentSession());
		return acaoDAO;
	}

}
