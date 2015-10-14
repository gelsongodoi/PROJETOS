package br.unisinos.financeiro.model.lancamento;

import java.util.Date;
import java.util.List;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.util.DAOFactory;

public class LancamentoRN {
	
	private LancamentoDAO lancamentoDAO;
	
	public LancamentoRN() {
		this.lancamentoDAO = DAOFactory.criarLancamentoDAO();
	}
	
	public void salvar(Lancamento lancamento) {
		this.lancamentoDAO.salvar(lancamento);
	}
	
	public void excluir(Lancamento lancamento) {
		this.lancamentoDAO.excluir(lancamento);
	}
	
	public Lancamento carregar(Integer codigo) {
		return this.lancamentoDAO.carregar(codigo);
	}
	
	public List<Lancamento> listarLancamentos(Conta conta, Date dataInicio, Date dataFim) {
		return this.lancamentoDAO.listarLancamentos(conta, dataInicio, dataFim);
	}

}

















