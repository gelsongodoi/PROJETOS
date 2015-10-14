package br.unisinos.financeiro.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.chart.PieChartModel;

import br.unisinos.financeiro.controller.util.ContextoUtil;
import br.unisinos.financeiro.controller.util.YahooFinanceUtil;
import br.unisinos.financeiro.model.acao.Acao;
import br.unisinos.financeiro.model.acao.AcaoRN;
import br.unisinos.financeiro.model.usuario.Usuario;

@ManagedBean(name = "acaoBean")
@RequestScoped
public class AcaoBean implements Serializable {

	private static final long serialVersionUID = 8693075457786980673L;

	private PieChartModel pieModel;
	private Acao selecionada = new Acao();
	private List<Acao> lista = null;
	private String linkCodigoAcao = null;

	private void createPieModel() {
		pieModel = new PieChartModel();
		this.lista = getLista();
		if (this.lista != null && this.lista.size() > 0) {
			// se tiver acoes cadastradas
			for (Acao acao : lista) {
				this.pieModel.set(acao.getSigla(), acao.getQuantidade());
			}
		} else {
			// primeira vez
			this.pieModel.set("", 100);
		}
	}

	public List<Acao> getLista() {
		if (this.lista == null) {
			ContextoBean contextoBean = ContextoUtil.getContextoBean();
			AcaoRN acaoRN = new AcaoRN(null);
			this.lista = acaoRN.listar(contextoBean.getUsuarioLogado());
		}
		return lista;
	}

	public void salvar() {
		ContextoBean contextoBean = ContextoUtil.getContextoBean();
		Usuario usuarioLogado = contextoBean.getUsuarioLogado();
		this.selecionada.setUsuario(usuarioLogado);
		this.selecionada.setSigla(this.selecionada.getSigla().toUpperCase());

		AcaoRN acaoRN = new AcaoRN(null);
		acaoRN.salvar(selecionada);

		this.selecionada = new Acao();
		this.lista = null;
		this.pieModel = null;
	}

	public void excluir() {
		AcaoRN acaoRN = new AcaoRN(null);
		acaoRN.excluir(selecionada);

		this.selecionada = new Acao();
		this.lista = null;
		this.pieModel = null;
	}

	public Acao getSelecionada() {
		return selecionada;
	}

	public void setSelecionada(Acao selecionada) {
		this.selecionada = selecionada;
	}

	public String getLinkCodigoAcao() {

		AcaoRN acaoRN = new AcaoRN(null);
		if (this.selecionada != null) {
			this.linkCodigoAcao = acaoRN.montaLinkAcao(this.selecionada);
		} else {
			this.linkCodigoAcao = YahooFinanceUtil.INDICE_BOVESPA;
		}

		return linkCodigoAcao;
	}

	public void setLinkCodigoAcao(String linkCodigoAcao) {
		this.linkCodigoAcao = linkCodigoAcao;
	}

	public AcaoBean() {
		createPieModel();
	}

	public PieChartModel getPieModel() {
		if (this.pieModel == null) {
			createPieModel();
		}
		return pieModel;
	}

}
