package com.example.demo.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ingresos {
	@Id
	private Long id;
	
	public enum Procedencia{
		SOCIO,ANONIMO
	}
	
	private Date fecha;
	private Procedencia procedencia;
	private int cantidad;
	private String descripcion;
	
	
	public Ingresos() {

	}
		

	public Ingresos(Long p_id, Date p_fecha, int p_cantidad, String p_descripcion) {
		super();
		id = p_id;
		fecha = p_fecha;
		cantidad = p_cantidad;
		descripcion = p_descripcion;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long p_id) {
		id = p_id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date p_fecha) {
		fecha = p_fecha;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int p_cantidad) {
		cantidad = p_cantidad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String p_descripcion) {
		descripcion = p_descripcion;
	}
	
	
	


	public Procedencia getProcedencia() {
		return procedencia;
	}


	public void setProcedencia(Procedencia p_procedencia) {
		procedencia = p_procedencia;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Ingresos other = (Ingresos) obj;
		if (cantidad != other.cantidad)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		}
		else if (!descripcion.equals(other.descripcion))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		}
		else if (!fecha.equals(other.fecha))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Ingresos [id=" + id + ", fecha=" + fecha + ", cantidad=" + cantidad + ", descripcion=" + descripcion + "]";
	}


	
	
	


}
