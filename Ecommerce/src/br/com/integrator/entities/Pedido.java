package br.com.integrator.entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
@Table(name = "PEDIDO")
public class Pedido implements java.io.Serializable {

	private static final long serialVersionUID = -1883361660755994043L;
	
	private Integer id;
	private Usuario usuario;
	private String ccNome;
	private BigDecimal ccTipo;
	private String ccNumero;
	private BigDecimal ccMExp;
	private BigDecimal ccAExp;
	private Timestamp dataPed;
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
	@JoinColumn(name = "USUARIO_ID")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Column(name = "CC_NOME", length = 50)
	public String getCcNome() {
		return this.ccNome;
	}

	public void setCcNome(String ccNome) {
		this.ccNome = ccNome;
	}

	@Column(name = "CC_TIPO", precision = 22, scale = 0)
	public BigDecimal getCcTipo() {
		return this.ccTipo;
	}

	public void setCcTipo(BigDecimal ccTipo) {
		this.ccTipo = ccTipo;
	}

	@Column(name = "CC_NUMERO", length = 20)
	public String getCcNumero() {
		return this.ccNumero;
	}

	public void setCcNumero(String ccNumero) {
		this.ccNumero = ccNumero;
	}

	@Column(name = "CC_M_EXP", precision = 22, scale = 0)
	public BigDecimal getCcMExp() {
		return this.ccMExp;
	}

	public void setCcMExp(BigDecimal ccMExp) {
		this.ccMExp = ccMExp;
	}

	@Column(name = "CC_A_EXP", precision = 22, scale = 0)
	public BigDecimal getCcAExp() {
		return this.ccAExp;
	}

	public void setCcAExp(BigDecimal ccAExp) {
		this.ccAExp = ccAExp;
	}

	@Column(name = "DATA_PED")
	public Timestamp getDataPed() {
		return this.dataPed;
	}

	public void setDataPed(Timestamp dataPed) {
		this.dataPed = dataPed;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	public Set<ItensPedido> getItensPedidos() {
		return this.itensPedidos;
	}

	public void setItensPedidos(Set<ItensPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

}
