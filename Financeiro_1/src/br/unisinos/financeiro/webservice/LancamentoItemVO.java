package br.unisinos.financeiro.webservice;

import java.util.Date;

public class LancamentoItemVO {

	private Date data;
	private String descricao;
	private float valor;

	public LancamentoItemVO() {

	}

	public LancamentoItemVO(Date data, String descricao, float valor) {
		super();
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
