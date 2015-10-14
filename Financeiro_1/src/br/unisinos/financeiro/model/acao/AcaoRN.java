package br.unisinos.financeiro.model.acao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unisinos.financeiro.controller.util.YahooFinanceUtil;
import br.unisinos.financeiro.model.usuario.Usuario;
import br.unisinos.financeiro.util.DAOFactory;

public class AcaoRN {

	private AcaoDAO acaoDAO;

	public AcaoRN(AcaoDAO acaoDAO) {
		this.acaoDAO = DAOFactory.criaAcaoDAO();
	}

	public Acao carregar(Integer codigo) {
		return this.acaoDAO.carregar(codigo);
	}

	public void salvar(Acao acao) {
		this.acaoDAO.salvar(acao);
	}

	public List<Acao> listar() {
		return this.acaoDAO.listar();
	}

	public List<Acao> listar(Usuario usuario) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("usuario", usuario);
		return this.acaoDAO.listPesqParam(params);
	}

	public void excluir(Acao selecionada) {
		this.acaoDAO.excluir(selecionada);
	}

	public String montaLinkAcao(Acao selecionada) {
		String link = null;
		if (selecionada != null) {
			if (selecionada.getOrigem() != null) {
				if (selecionada.getOrigem() == YahooFinanceUtil.ORIGEM_BOVESPA) {
					link = selecionada.getSigla()
							+ YahooFinanceUtil.POSFIXO_ACAO_BOVESPA;
				} else {
					link = selecionada.getSigla();
				}
			} else {
				link = YahooFinanceUtil.INDICE_BOVESPA;
			}
		} else {
			link = YahooFinanceUtil.INDICE_BOVESPA;
		}
		return link;
	}

}
