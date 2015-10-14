package br.unisinos.financeiro.model.conta;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.unisinos.financeiro.model.usuario.Usuario;
import br.unisinos.financeiro.util.DAOFactory;

public class ContaRN {
	
	private ContaDAO contaDAO;
	
	public ContaRN() {
		this.contaDAO = DAOFactory.criaContaDAO();
	}
	
	public Conta carregar(Integer codigo) {
		return this.contaDAO.carregar(codigo);
	}
	
	public void salvar(Conta conta) {
		conta.setDataCadastro(new Date());
		this.contaDAO.salvar(conta);
	}

	public List<Conta> listar() {
		return this.contaDAO.listar();
	}

	public List<Conta> listar(Usuario usuario) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("usuario", usuario);		
		return this.contaDAO.listPesqParam(params);
	}

	public Conta buscarFavorita(Usuario usuario) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("usuario", usuario);
		params.put("favorita", true);
		return this.contaDAO.pesqParam(params);
	}

	public void excluir(Conta selecionada) {
		this.contaDAO.excluir(selecionada);
	}

	public void tornarFavorita(Conta selecionada) {
		Conta conta = this.buscarFavorita(selecionada.getUsuario());
		if (conta != null) {
			conta.setFavorita(Boolean.FALSE);
			this.contaDAO.salvar(conta);
		}
		selecionada.setFavorita(Boolean.TRUE);		
		this.contaDAO.salvar(selecionada);		
	}

}












