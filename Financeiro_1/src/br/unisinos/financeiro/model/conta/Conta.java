package br.unisinos.financeiro.model.conta;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import br.unisinos.financeiro.model.usuario.Usuario;

@Entity
@Table(name = "CONTA_BANCARIA")
@SequenceGenerator(name="finContaSeq", sequenceName="FIN_CONTA_SEQ")
public class Conta implements Serializable {

	private static final long serialVersionUID = 2554165136043604538L;

	private Integer conta;
	private String descricao;
	private Date dataCadastro;
	private Float saldoInicial;
	private Boolean favorita;

	private Usuario usuario;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="finContaSeq")	
	public Integer getConta() {
		return conta;
	}

	public void setConta(Integer conta) {
		this.conta = conta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name="data_cadastro", nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Column(name="saldo_inicial")
	public Float getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public Boolean getFavorita() {
		if (this.favorita == null) {
			this.favorita = Boolean.FALSE;
		}
		return favorita;
	}

	public void setFavorita(Boolean favorita) {
		this.favorita = favorita;
	}

	@ManyToOne
	@JoinColumn(name="cod_usuario", nullable=false)
	@OnDelete(action=OnDeleteAction.CASCADE)
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conta == null) ? 0 : conta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (conta == null) {
			if (other.conta != null)
				return false;
		} else if (!conta.equals(other.conta))
			return false;
		return true;
	}



}
