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
@Table(name = "rol")
public class Rol implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo_rol")
	private Long codigoRol;
	@Column(name="rol")
	private String rol;
	@JsonIgnore
	@OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	public Rol(Long codigoRol, String rol, Set<Usuario> usuarios) {
		super();
		this.codigoRol = codigoRol;
		this.rol = rol;
		this.usuarios = usuarios;
	}
	public Rol(Long codigoRol, String rol) {
		super();
		this.codigoRol = codigoRol;
		this.rol = rol;
	}
	public Rol() {
		super();
	}
	public Long getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(Long codigoRol) {
		this.codigoRol = codigoRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoRol == null) ? 0 : codigoRol.hashCode());
		result = prime * result + ((rol == null) ? 0 : rol.hashCode());
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
		Rol other = (Rol) obj;
		if (codigoRol == null) {
			if (other.codigoRol != null)
				return false;
		} else if (!codigoRol.equals(other.codigoRol))
			return false;
		if (rol == null) {
			if (other.rol != null)
				return false;
		} else if (!rol.equals(other.rol))
			return false;
		return true;
	}
	
}
