package com.example.demo.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gastos {
	@Id
	private Long id;
	
	public enum Destinario{
		PROYECTO,COMUNIDAD,BECADO;
	}
	public enum isVerified{
		SI,NO;
	}
	private isVerified isVerified;
	private Date fecha;
	private Destinario destinatario;
	private int cantidad;
	private String descripcion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public isVerified getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(isVerified isVerified) {
		this.isVerified = isVerified;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Destinario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinario destinatario) {
		this.destinatario = destinatario;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((destinatario == null) ? 0 : destinatario.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isVerified == null) ? 0 : isVerified.hashCode());
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
		Gastos other = (Gastos) obj;
		if (cantidad != other.cantidad)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (destinatario != other.destinatario)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isVerified != other.isVerified)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Gastos [id=" + id + ", isVerified=" + isVerified + ", fecha=" + fecha + ", destinatario=" + destinatario
				+ ", cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}
	
	
	


}
