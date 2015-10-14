package br.unisinos.financeiro.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.StreamedContent;

import br.unisinos.financeiro.controller.util.ContextoUtil;
import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.lancamento.Lancamento;
import br.unisinos.financeiro.model.lancamento.LancamentoRN;
import br.unisinos.financeiro.model.usuario.Usuario;

@ManagedBean(name = "lancamentoBean")
@ViewScoped
public class LancamentoBean {

	private List<Lancamento> lista;
	private List<Double> saldos = new ArrayList<Double>();
	private double saldoGeral;

	private Lancamento editado = new Lancamento();
	private Date dataInicialRelatorio;
	private Date dataFinalRelatorio;

	private StreamedContent arquivoRetorno;
	
	public LancamentoBean() {
		this.novo();
	}
	
	public void novo() {
		this.editado = new Lancamento();
		this.editado.setData(new Date());
	}
	
	public void salvar() {
		
		ContextoBean contextoBean = ContextoUtil.getContextoBean();
		Usuario usuarioLogado = contextoBean.getUsuarioLogado();
		Conta contaAtiva = contextoBean.getContaAtiva();
		
		this.editado.setUsuario(usuarioLogado);
		this.editado.setConta(contaAtiva);
		
		LancamentoRN lancamentoRN = new LancamentoRN();
		lancamentoRN.salvar(editado);
		
		this.novo();
		this.lista = null;
	}
	
	public void excluir() {
		LancamentoRN lancamentoRN = new LancamentoRN();
		this.editado = lancamentoRN.carregar(this.editado.getId());
		lancamentoRN.excluir(editado);
		this.lista = null;
	}
	
	// Setters and Getters

	public List<Lancamento> getLista() {
		if (this.lista == null) {
			ContextoBean contextoBean = ContextoUtil.getContextoBean();
			Conta contaAtiva = contextoBean.getContaAtiva();
			
			LancamentoRN lancamentoRN = new LancamentoRN();
			this.lista = lancamentoRN.listarLancamentos(contaAtiva, null, null);
		}
		return lista;
	}

	public void setLista(List<Lancamento> lista) {
		this.lista = lista;
	}

	public List<Double> getSaldos() {
		return saldos;
	}

	public void setSaldos(List<Double> saldos) {
		this.saldos = saldos;
	}

	public double getSaldoGeral() {
		return saldoGeral;
	}

	public void setSaldoGeral(double saldoGeral) {
		this.saldoGeral = saldoGeral;
	}

	public Lancamento getEditado() {
		return editado;
	}

	public void setEditado(Lancamento editado) {
		this.editado = editado;
	}

	public Date getDataInicialRelatorio() {
		return dataInicialRelatorio;
	}

	public void setDataInicialRelatorio(Date dataInicialRelatorio) {
		this.dataInicialRelatorio = dataInicialRelatorio;
	}

	public Date getDataFinalRelatorio() {
		return dataFinalRelatorio;
	}

	public void setDataFinalRelatorio(Date dataFinalRelatorio) {
		this.dataFinalRelatorio = dataFinalRelatorio;
	}

	public StreamedContent getArquivoRetorno() {
		return arquivoRetorno;
	}

	public void setArquivoRetorno(StreamedContent arquivoRetorno) {
		this.arquivoRetorno = arquivoRetorno;
	}

}
