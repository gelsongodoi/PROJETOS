package br.unisinos.financeiro.model.lancamento;

import java.io.Serializable;
import java.math.BigDecimal;
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

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import br.unisinos.financeiro.model.categoria.Categoria;
import br.unisinos.financeiro.model.conta.Conta;
import br.unisinos.financeiro.model.usuario.Usuario;

@Entity
@Table(name = "LANCAMENTO")
@SequenceGenerator(name="finLancamentoSeq", sequenceName="FIN_LANCAMENTO_SEQ")
public class Lancamento implements Serializable {

	private static final long serialVersionUID = 2219109833029212383L;

	private Integer id;
	private Usuario usuario;
	private Conta conta;
	private Categoria categoria;
	private Date data;
	private String descricao;
	private BigDecimal valor;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="finLancamentoSeq")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(name="cod_usuario", nullable=false)
	@ForeignKey(name="fk_lancamento_usuario")
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(name="cod_conta", nullable=false)
	@ForeignKey(name="fk_lancamento_conta")	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@ManyToOne
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinColumn(name="cod_categoria", nullable=false)
	@ForeignKey(name="fk_lancamento_categoria")		
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name="descricao", length=60)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(precision=10, scale=2)
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Lancamento other = (Lancamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
