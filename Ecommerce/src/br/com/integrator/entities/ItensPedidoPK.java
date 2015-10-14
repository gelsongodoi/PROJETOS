package br.com.integrator.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ItensPedidoPK implements java.io.Serializable {

	private static final long serialVersionUID = 4461542125962943283L;
	
	private Integer pedId;
	private Integer prodId;
	
	public ItensPedidoPK(Integer pedId, Integer prodId) {
		this.pedId = pedId;
		this.prodId = prodId;
	}	

	@Column(name = "PED_ID", precision = 22, scale = 0)
	public Integer getPedId() {
		return this.pedId;
	}

	public void setPedId(Integer pedId) {
		this.pedId = pedId;
	}

	@Column(name = "PROD_ID", precision = 22, scale = 0)
	public Integer getProdId() {
		return this.prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

}
