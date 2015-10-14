package br.com.integrator.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "ecoCategoriaSeq", sequenceName = "eco_categoria_seq")
@Table(name = "CATEGORIA")
public class Categoria implements java.io.Serializable {

	private static final long serialVersionUID = -5512441849768568638L;

	private Integer id;
	private String catNome;

	private Set<Produto> produtos = new HashSet<Produto>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ecoCategoriaSeq")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "CAT_NOME", length = 30)
	public String getCatNome() {
		return this.catNome;
	}

	public void setCatNome(String catNome) {
		this.catNome = catNome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	public Set<Produto> getProdutos() {
		return this.produtos;
	}

	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}

}
