package br.unisinos.financeiro.controller;

import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.conta.ContaRN;
import br.unisinos.financeiro.model.usuario.Usuario;
import br.unisinos.financeiro.model.usuario.UsuarioRN;

@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {
	
	private Usuario usuario = new Usuario();
	private List<Usuario> lista;
	private String confirmarSenha;
	private String destinoSalvar;
	private String permissao;
	private Conta conta = new Conta();
	
	public String novo() {
		this.destinoSalvar = "usuarioSucesso";
		this.usuario = new Usuario();
		this.usuario.setAtivo(true);
		return "usuario";
	}
	
	public String salvar() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		String senha = this.usuario.getSenha();
		
		if (!senha.equals(this.confirmarSenha)) {
			FacesMessage facesMessage = new FacesMessage("Senha não confere");
			context.addMessage(null, facesMessage);
			return null;
		}
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		
		if (this.conta.getDescricao() != null) {
			this.conta.setUsuario(usuario);
			this.conta.setFavorita(true);
			
			ContaRN contaRN = new ContaRN();
			contaRN.salvar(conta);
		}
		
		return destinoSalvar;
	}
	
	public void ativar() {
		if (this.usuario.getAtivo()) {
			this.usuario.setAtivo(false);
		} else {
			this.usuario.setAtivo(true);
		}
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.salvar(usuario);
		// return null;
	}
	
	public void atribuiPermissao(Usuario usuario, String permissao) {
		this.usuario = usuario;
		Set<String> permissoes = this.usuario.getPermissao();
		if (permissoes.contains(permissao)) {
			permissoes.remove(permissao);
		} else {
			permissoes.add(permissao);
		}
//		this.usuario.setPermissao(permissoes);
//		UsuarioRN usuarioRN = new UsuarioRN();
//		usuarioRN.salvar(usuario);
	}
	
	public String editar() {
		this.confirmarSenha = this.usuario.getSenha();
		return "/publico/usuario";
	}
	
	public void excluir() {
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(this.usuario);
		this.lista = null;
	}

	public List<Usuario> getLista() {
		if (this.lista == null) {
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}
	
}















