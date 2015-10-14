package br.unisinos.financeiro.model.usuario;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;

import br.unisinos.financeiro.test.util.HibernateUtilTest;

public class UsuarioDAOImplTest {
	
	private Session session;
	private Criteria criteria;

	@Before
	public void setUp() throws Exception {
		session = HibernateUtilTest.getSession();
		criteria = session.createCriteria(Usuario.class);
	}

	@Test
	public void testSalvar() {
		
		Set<String> permissoes = new HashSet<String>();
		permissoes.add("ROLE_USUARIO");
		permissoes.add("ROLE_ADMINISTRADOR");
		
		Usuario usuario = new Usuario();
		usuario.setNome("Gelson");
		usuario.setLogin("gelson");
		usuario.setSenha("gelson");
		usuario.setEmail("gelson@email.com");
		
		usuario.setPermissao(permissoes);
		
		Transaction transaction = session.beginTransaction();
		session.save(usuario);
		transaction.commit();
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testListar() {
		
		List<Usuario> lista = criteria.list();
		for (Usuario usuario : lista) {
			System.out.println(usuario.getCodigo() + " - " + usuario.getNome());
			Set<String> permissoes = usuario.getPermissao();
			for (String permissao : permissoes) {
				System.out.println("Permissao = " + permissao);
			}
		}
		
	}

}















