package com.example.demo.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bienes {
	@Id
	private String id;

	private enum Tipo{
		MEDICAMENTOS,COMIDA,ROPA;
	}
	private Tipo tipo;
	private Long cantidad;
	private Date fecha;
	private String procedencia;
	private String descripcion;
	
	public Bienes() {
		
	}
	
	@Override
	public String toString() {
		return "Bienes [id=" + id + ", tipo=" + tipo + ", cantidad=" + cantidad + ", fecha=" + fecha + ", procedencia="
				+ procedencia + ", descripcion=" + descripcion + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((procedencia == null) ? 0 : procedencia.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Bienes other = (Bienes) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
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
		if (procedencia == null) {
			if (other.procedencia != null)
				return false;
		} else if (!procedencia.equals(other.procedencia))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Bienes(String id, Tipo tipo, Long cantidad, Date fecha, String procedencia, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.procedencia = procedencia;
		this.descripcion = descripcion;
	}
	
	

	

}

