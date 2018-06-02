package com.labproductos.core.model;
import java.util.Date;
import java.util.Set;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_producto")
	private Long codigoProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="modelo")
	private String modelo;
	@Column(name="precio")
	private Float precio;
	@Column(name="garantia")
	private int garantia;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_pais", insertable = true, updatable = true)
	private Pais pais;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="codigo_tipo_instrumento", insertable = true, updatable = true)
	private TipoInstrumento tipoInstrumento;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Producto(Long codigoProducto, String nombre, String modelo, Float precio, int garantia) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.modelo = modelo;
		this.precio = precio;
		this.garantia = garantia;
	}


	public Long getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public TipoInstrumento getTipoInstrumento() {
		return tipoInstrumento;
	}
	public void setTipoInstrumento(TipoInstrumento tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoProducto == null) ? 0 : codigoProducto.hashCode());
		result = prime * result + garantia;
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((precio == null) ? 0 : precio.hashCode());
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
		Producto other = (Producto) obj;
		if (codigoProducto == null) {
			if (other.codigoProducto != null)
				return false;
		} else if (!codigoProducto.equals(other.codigoProducto))
			return false;
		if (garantia != other.garantia)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (precio == null) {
			if (other.precio != null)
				return false;
		} else if (!precio.equals(other.precio))
			return false;
		return true;
	}
	
	
}
