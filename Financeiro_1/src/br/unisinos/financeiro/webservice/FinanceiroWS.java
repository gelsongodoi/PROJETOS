package br.unisinos.financeiro.webservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.conta.ContaRN;
import br.unisinos.financeiro.model.lancamento.Lancamento;
import br.unisinos.financeiro.model.lancamento.LancamentoRN;

@WebService
public class FinanceiroWS {

	@WebMethod
	public List<LancamentoItemVO> extrato(@WebParam(name = "conta") int conta,
			@WebParam(name = "de") Date de, @WebParam(name = "ate") Date ate) {

		LancamentoRN lancamentoRN = new LancamentoRN();
		ContaRN contaRN = new ContaRN();
		List<LancamentoItemVO> retorno = new ArrayList<LancamentoItemVO>();
		LancamentoItemVO lancamentoItemVO = null;

		Conta contaPesquisada = contaRN.carregar(conta);
		List<Lancamento> listaLancamento = lancamentoRN.listarLancamentos(
				contaPesquisada, de, ate);

		for (Lancamento lancamento : listaLancamento) {
			lancamentoItemVO = new LancamentoItemVO();
			lancamentoItemVO.setData(lancamento.getData());
			lancamentoItemVO.setDescricao(lancamento.getDescricao());
			lancamentoItemVO.setValor(lancamento.getValor().floatValue());

			retorno.add(lancamentoItemVO);
		}

		return retorno;
	}

}
