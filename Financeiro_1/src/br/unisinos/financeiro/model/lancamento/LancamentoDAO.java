package br.unisinos.financeiro.model.lancamento;

import java.util.Date;
import java.util.List;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.dao.DaoGenerico;

public interface LancamentoDAO extends DaoGenerico<Lancamento, Integer> {

	List<Lancamento> listarLancamentos(Conta conta, Date dataInicio, Date dataFim);

}
