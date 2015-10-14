package br.unisinos.financeiro.model.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class DaoGenericoImp<T, ID extends Serializable> implements DaoGenerico<T, ID> {

	private Session session;

	private final Class<T> oClass; // object class

	public Class<T> getObjectClass() {
		return this.oClass;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	protected Session getSession() {
		if (session == null)
			throw new IllegalStateException("Erro");
		return session;
	}

	@SuppressWarnings("unchecked")
	public DaoGenericoImp() {
		this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T atualizar(T object) {
		getSession().merge(object);
		return object;
	}

	@SuppressWarnings("unchecked")
	public void excluir(T object) {
		object = (T) getSession().merge(object);
		getSession().delete(object);
	}

	@SuppressWarnings("unchecked")
	public T carregar(ID id) {
		return (T) getSession().get(oClass, id);
	}

	public T salvar(T object) {
		getSession().clear();
		// getSession().persist(object);  // persiste a primeira vez
		getSession().saveOrUpdate(object);
		getSession().flush();
		return object;
	}

	@SuppressWarnings("unchecked")
	public List<T> listar() {
		String queryS = "SELECT obj FROM " + oClass.getSimpleName() + " obj order by 1";
		Query query = getSession().createQuery(queryS);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> listPesqParam(String query, Map<String, Object> params) {
		Query q = getSession().createQuery(query);
		for (String chave : params.keySet()) {
			q.setParameter(chave, params.get(chave));
		}
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listPesqParam(Map<String, Object> params) {
		Criteria q = getSession().createCriteria(oClass);
		for (String chave : params.keySet()) {
			q.add(Restrictions.eq(chave, params.get(chave)));
		}
		return q.list();
	}	

	@SuppressWarnings("unchecked")
	public List<T> listPesqParam(String query, Map<String, Object> params, int maximo, int atual) {
		Query q = getSession().createQuery(query).setMaxResults(maximo).setFirstResult(atual);

		for (String chave : params.keySet()) {
			q.setParameter(chave, params.get(chave));
		}
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public List<T> listPesq(String query) {
		Query q = getSession().createQuery(query);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public T pesqParam(String query, Map<String, Object> params) {
		Query q = getSession().createQuery(query);
		for (String chave : params.keySet()) {
			q.setParameter(chave, params.get(chave));
		}
		return (T) q.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public T pesqParam(Map<String, Object> params) {
		Criteria q = getSession().createCriteria(oClass);
		for (String chave : params.keySet()) {
			q.add(Restrictions.eq(chave, params.get(chave)));
		}
		return (T) q.uniqueResult();
	}	

}
