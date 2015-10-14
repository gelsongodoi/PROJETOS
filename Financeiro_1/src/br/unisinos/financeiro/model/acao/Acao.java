package br.unisinos.financeiro.model.acao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import br.unisinos.financeiro.model.usuario.Usuario;

@Entity
@Table(name = "ACAO")
@SequenceGenerator(name = "finAcaoSeq", sequenceName = "FIN_ACAO_SEQ")
public class Acao implements Serializable {

	private static final long serialVersionUID = 1025628962754756016L;

	private Integer codigo;
	private String sigla;
	private String descricao;
	private Integer quantidade;
	private Character origem;

	private Usuario usuario;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "finAcaoSeq")
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(nullable = false, length = 10)
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(nullable = false, length = 30)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(nullable = false)
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Column(nullable = false, length = 1)
	public Character getOrigem() {
		return origem;
	}

	public void setOrigem(Character origem) {
		this.origem = origem;
	}

	@ManyToOne
	@JoinColumn(name = "cod_usuario", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@ForeignKey(name = "fk_acao_usuario")
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
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Acao other = (Acao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
