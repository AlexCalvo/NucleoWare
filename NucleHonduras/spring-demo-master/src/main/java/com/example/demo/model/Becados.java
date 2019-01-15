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
	private Long notaMedia;
	private String observaciones;
	private String proyecto;
	private String comunidad;
	
	public Becados() {

	}

	public Long getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(Long notaMedia) {
		this.notaMedia = notaMedia;
	}

	public Becados(String id, String nombre, String apellido, Date fecha_nacimiento, Date fecha_ingreso_acoes,
			Date fecha_ingreso_proyecto, Date fecha_salida_proyecto, Long notaMedia, String observaciones,
			String proyecto, String comunidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_ingreso_acoes = fecha_ingreso_acoes;
		this.fecha_ingreso_proyecto = fecha_ingreso_proyecto;
		this.fecha_salida_proyecto = fecha_salida_proyecto;
		this.notaMedia = notaMedia;
		this.observaciones = observaciones;
		this.proyecto = proyecto;
		this.comunidad = comunidad;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((comunidad == null) ? 0 : comunidad.hashCode());
		result = prime * result + ((fecha_ingreso_acoes == null) ? 0 : fecha_ingreso_acoes.hashCode());
		result = prime * result + ((fecha_ingreso_proyecto == null) ? 0 : fecha_ingreso_proyecto.hashCode());
		result = prime * result + ((fecha_nacimiento == null) ? 0 : fecha_nacimiento.hashCode());
		result = prime * result + ((fecha_salida_proyecto == null) ? 0 : fecha_salida_proyecto.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((notaMedia == null) ? 0 : notaMedia.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((proyecto == null) ? 0 : proyecto.hashCode());
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
		Becados other = (Becados) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (comunidad == null) {
			if (other.comunidad != null)
				return false;
		} else if (!comunidad.equals(other.comunidad))
			return false;
		if (fecha_ingreso_acoes == null) {
			if (other.fecha_ingreso_acoes != null)
				return false;
		} else if (!fecha_ingreso_acoes.equals(other.fecha_ingreso_acoes))
			return false;
		if (fecha_ingreso_proyecto == null) {
			if (other.fecha_ingreso_proyecto != null)
				return false;
		} else if (!fecha_ingreso_proyecto.equals(other.fecha_ingreso_proyecto))
			return false;
		if (fecha_nacimiento == null) {
			if (other.fecha_nacimiento != null)
				return false;
		} else if (!fecha_nacimiento.equals(other.fecha_nacimiento))
			return false;
		if (fecha_salida_proyecto == null) {
			if (other.fecha_salida_proyecto != null)
				return false;
		} else if (!fecha_salida_proyecto.equals(other.fecha_salida_proyecto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (notaMedia == null) {
			if (other.notaMedia != null)
				return false;
		} else if (!notaMedia.equals(other.notaMedia))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (proyecto == null) {
			if (other.proyecto != null)
				return false;
		} else if (!proyecto.equals(other.proyecto))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Becados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento="
				+ fecha_nacimiento + ", fecha_ingreso_acoes=" + fecha_ingreso_acoes + ", fecha_ingreso_proyecto="
				+ fecha_ingreso_proyecto + ", fecha_salida_proyecto=" + fecha_salida_proyecto + ", notaMedia="
				+ notaMedia + ", observaciones=" + observaciones + ", proyecto=" + proyecto + ", comunidad=" + comunidad
				+ "]";
	}



}
