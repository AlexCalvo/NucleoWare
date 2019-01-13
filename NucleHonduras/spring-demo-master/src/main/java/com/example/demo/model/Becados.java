package com.example.demo.model;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Becados {
	@Id
	private String id;

	private String nombre;
	private String apellido;
	private Date fecha_nacimiento;
	private Date fecha_ingreso_acoes;
	private Date fecha_ingreso_proyecto;
	private Date fecha_salida_proyecto;
	private String observaciones;
	private String proyecto;
	private String comunidad;
	
	public Becados() {

	}

	public Becados(String nombre, String apellido, String id,Date fecha_nacimiento,Date fecha_ingreso_acoes,Date fecha_ingreso_proyecto,Date fecha_salida_proyecto, String observaciones) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_ingreso_acoes = fecha_ingreso_acoes;
		this.fecha_ingreso_proyecto = fecha_ingreso_proyecto;
		this.fecha_salida_proyecto = fecha_salida_proyecto;
		this.observaciones = observaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Date getFecha_ingreso_acoes() {
		return fecha_ingreso_acoes;
	}

	public void setFecha_ingreso_acoes(Date fecha_ingreso_acoes) {
		this.fecha_ingreso_acoes = fecha_ingreso_acoes;
	}

	public Date getFecha_ingreso_proyecto() {
		return fecha_ingreso_proyecto;
	}

	public void setFecha_ingreso_proyecto(Date fecha_ingreso_proyecto) {
		this.fecha_ingreso_proyecto = fecha_ingreso_proyecto;
	}

	public Date getFecha_salida_proyecto() {
		return fecha_salida_proyecto;
	}

	public void setFecha_salida_proyecto(Date fecha_salida_proyecto) {
		this.fecha_salida_proyecto = fecha_salida_proyecto;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String p_proyecto) {
		proyecto = p_proyecto;
	}

	
	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String p_comunidad) {
		comunidad = p_comunidad;
	}

	@Override
	public String toString() {
		return "Becados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_ingreso_acoes=" + fecha_ingreso_acoes
				+ ", fecha_ingreso_proyecto=" + fecha_ingreso_proyecto + ", fecha_salida_proyecto="
				+ fecha_salida_proyecto + ", observaciones=" + observaciones + "]";
	}

	public int hashCode() {
		try {
			return Integer.parseInt(id);
		} catch (Exception er) {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		final Becados other = (Becados) obj;
		if (!id.equals(other.getId()))
			return false;
		return true;
	}

}
