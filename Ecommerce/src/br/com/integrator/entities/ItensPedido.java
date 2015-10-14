package br.com.integrator.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ITENS_PEDIDO")
public class ItensPedido implements java.io.Serializable {

	private static final long serialVersionUID = 71596414058944751L;

	private ItensPedidoPK id;
	private BigDecimal qtd;
	private BigDecimal preco;

	private Produto produto;
	private Pedido pedido;

	@Transient
	private Double subTotal;

	public ItensPedido(BigDecimal qtd, Double preco, Integer pedido,
			Integer produto) {
		this.id = new ItensPedidoPK(pedido, produto);
		this.qtd = qtd;
		this.preco = BigDecimal.valueOf(preco);
	}

	public ItensPedido() {
	}

	@EmbeddedId
	public ItensPedidoPK getId() {
		return this.id;
	}

	public void setId(ItensPedidoPK id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROD_ID", insertable = false, updatable = false)
	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PED_ID", insertable = false, updatable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "QTD", precision = 22, scale = 0)
	public BigDecimal getQtd() {
		return this.qtd;
	}

	public void setQtd(BigDecimal qtd) {
		this.qtd = qtd;
	}

	@Column(name = "PRECO", precision = 10)
	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getSubTotal() {
		return subTotal;
	}

}
