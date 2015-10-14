package br.unisinos.financeiro.model.lancamento;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.dao.DaoGenericoImp;

public class LancamentoDAOImpl extends DaoGenericoImp<Lancamento, Integer>
		implements LancamentoDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Lancamento> listarLancamentos(Conta conta, Date dataInicio, Date dataFim) {

		Criteria criteria = getSession().createCriteria(Lancamento.class);
		
		if (dataInicio != null && dataFim != null) {
			criteria.add(Restrictions.between("data", dataInicio, dataFim));
		}
		if (dataInicio != null) {
			criteria.add(Restrictions.ge("data", dataInicio));
		}
		if (dataFim != null) {
			criteria.add(Restrictions.le("data", dataFim));
		}
		criteria.add(Restrictions.eq("conta", conta));
		criteria.addOrder(Order.asc("data"));
		
		return criteria.list();
	}

}
