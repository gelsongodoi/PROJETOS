package br.unisinos.financeiro.model.cheque;

import java.io.Serializable;
import java.util.Date;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.lancamento.Lancamento;

public class Cheque implements Serializable {

	private static final long serialVersionUID = -3384982264753009116L;
	
	private ChequeId chequeId;
	private Conta conta;
	private Date dataCadastro;
	private Character situacao;
	private Lancamento lancamento;
	

}
