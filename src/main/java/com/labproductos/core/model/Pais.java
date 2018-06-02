package com.labproductos.core.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
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
@Table(name = "pais")
public class Pais implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_pais")
	private Long codigoPais;
	@Column(name="descripcion")
	private String descripcion;
	@JsonIgnore
	@OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
	private Set<Producto> productos = new HashSet<Producto>();
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pais(Long codigoPais, String descripcion) {
		super();
		this.codigoPais = codigoPais;
		this.descripcion = descripcion;
	}

	public Long getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Long codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoPais == null) ? 0 : codigoPais.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
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
		Pais other = (Pais) obj;
		if (codigoPais == null) {
			if (other.codigoPais != null)
				return false;
		} else if (!codigoPais.equals(other.codigoPais))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		return true;
	}
	
	
}
