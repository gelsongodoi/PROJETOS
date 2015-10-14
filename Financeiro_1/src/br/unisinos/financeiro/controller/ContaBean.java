package br.unisinos.financeiro.controller;

import java.util.HashMap;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.StreamedContent;

import br.unisinos.financeiro.controller.util.ContextoUtil;
import br.unisinos.financeiro.controller.util.RelatorioUtil;
import br.unisinos.financeiro.exception.UtilException;
import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.conta.ContaRN;
import br.unisinos.financeiro.model.usuario.Usuario;

@ManagedBean(name = "contaBean")
@RequestScoped
public class ContaBean {

	private Conta selecionada = new Conta();
	private List<Conta> lista = null;
	private StreamedContent arquivoRetorno;
	private int tipoRelatorio;
	
	public void salvar() {
		ContextoBean contextoBean = ContextoUtil.getContextoBean();
		Usuario usuarioLogado = contextoBean.getUsuarioLogado();
		this.selecionada.setUsuario(usuarioLogado);
		
		ContaRN contaRN = new ContaRN();
		contaRN.salvar(selecionada);
		
		this.selecionada = new Conta();
		this.lista = null;
	}
	
	public void excluir() {
		ContaRN contaRN = new ContaRN();
		contaRN.excluir(this.selecionada);
		
		this.selecionada = new Conta();
		this.lista = null;
	}
	
	public void tornarFavorita() {
		ContaRN contaRN = new ContaRN();
		contaRN.tornarFavorita(this.selecionada);
		
		this.selecionada = new Conta();
		this.lista = null;
	}
	

	public Conta getSelecionada() {
		return selecionada;
	}

	public void setSelecionada(Conta selecionada) {
		this.selecionada = selecionada;
	}

	public List<Conta> getLista() { // id :listagem  - 2
		if (this.lista == null) {
			ContextoBean contextoBean = ContextoUtil.getContextoBean();
			ContaRN contaRN = new ContaRN();
			this.lista = contaRN.listar(contextoBean.getUsuarioLogado());
		}
		return lista;
	}

	public void setLista(List<Conta> lista) {
		this.lista = lista;
	}

	public StreamedContent getArquivoRetorno() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		ContextoBean contextoBean = ContextoUtil.getContextoBean();
		Usuario usuarioLogado = contextoBean.getUsuarioLogado();
		String nomeRelatorioJasper = "contas";
		String nomeRelatorioSaida = usuarioLogado.getLogin() + "_"
				+ nomeRelatorioJasper;
		RelatorioUtil relatorioUtil = new RelatorioUtil();
		HashMap<String,Object> parametrosRelatorio = new HashMap<String, Object>();
		parametrosRelatorio.put("codigoUsuario", usuarioLogado.getCodigo());
		try {
			arquivoRetorno = relatorioUtil.geraRelatorio(parametrosRelatorio, nomeRelatorioJasper,
					nomeRelatorioSaida, tipoRelatorio);
		} catch (UtilException e) {
			context.addMessage(null, new FacesMessage(e.getMessage()));
			return null;
		}
		
		return arquivoRetorno;
	}

	public void setArquivoRetorno(StreamedContent arquivoRetorno) {
		this.arquivoRetorno = arquivoRetorno;
	}

	public int getTipoRelatorio() {
		return tipoRelatorio;
	}

	public void setTipoRelatorio(int tipoRelatorio) {
		this.tipoRelatorio = tipoRelatorio;
	}

}
