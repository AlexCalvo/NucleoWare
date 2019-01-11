package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comunidades {
	@Id
	private String id;

	private String nombre;
	private String ubicacion;
	private String poblacion;
	private String numeroNinos;
	private String observaciones;
	
	
	public Comunidades() {

	}

	public Comunidades(String nombre, String ubicacion, String id,String poblacion,String numeroNinos, String observaciones) {
		this.nombre = nombre;
		this.ubicacion =ubicacion;
		this.id = id;
		this.poblacion = poblacion;
		this.numeroNinos = numeroNinos;
		this.observaciones = observaciones;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getNumeroNinos() {
		return numeroNinos;
	}

	public void setNumeroNinos(String numeroNinos) {
		this.numeroNinos = numeroNinos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((numeroNinos == null) ? 0 : numeroNinos.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
		result = prime * result + ((ubicacion == null) ? 0 : ubicacion.hashCode());
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
		Comunidades other = (Comunidades) obj;
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
		if (numeroNinos == null) {
			if (other.numeroNinos != null)
				return false;
		} else if (!numeroNinos.equals(other.numeroNinos))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (poblacion == null) {
			if (other.poblacion != null)
				return false;
		} else if (!poblacion.equals(other.poblacion))
			return false;
		if (ubicacion == null) {
			if (other.ubicacion != null)
				return false;
		} else if (!ubicacion.equals(other.ubicacion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Comunidades [id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", poblacion=" + poblacion
				+ ", numeroNinos=" + numeroNinos + ", observaciones=" + observaciones + "]";
	}

}