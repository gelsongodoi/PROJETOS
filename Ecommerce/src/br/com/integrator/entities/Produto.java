package br.com.integrator.entities;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "PRODUTO")
public class Produto implements java.io.Serializable {

	private static final long serialVersionUID = -831067785598878828L;
	
	private Integer id;
	private Categoria categoria;
	private String prodNome;
	private BigDecimal preco;	
	private Double desconto;
	private String descPeq;
	private String descGd;
	private String imagem;
	
	private Set<ItensPedido> itensPedidos = new HashSet<ItensPedido>();

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")		
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAT_ID", referencedColumnName="ID")
	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Column(name = "PROD_NOME", length = 40)
	public String getProdNome() {
		return this.prodNome;
	}

	public void setProdNome(String prodNome) {
		this.prodNome = prodNome;
	}

	@Column(name = "PRECO", precision = 22, scale = 0)
	public BigDecimal getPreco() {
		return this.preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Column(name = "DESC_PEQ", length = 400)
	public String getDescPeq() {
		return this.descPeq;
	}

	public void setDescPeq(String descPeq) {
		this.descPeq = descPeq;
	}

	@Column(name = "DESC_GD", length = 400)
	public String getDescGd() {
		return this.descGd;
	}

	public void setDescGd(String descGd) {
		this.descGd = descGd;
	}

	@Column(name = "IMAGEM", length = 100)
	public String getImagem() {
		return this.imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "produto")
	public Set<ItensPedido> getItensPedidos() {
		return this.itensPedidos;
	}

	public void setItensPedidos(Set<ItensPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	@Column(name = "DESCONTO", precision = 22, scale = 0)
	public Double getDesconto() {
		return desconto;
	}

}






