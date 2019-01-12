package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Socios {
	
	@Id
	private String dni;

	private String nombre;
	private String apellido;
	private String email;
	private String telefono;
	private String direccion;
	private String provincia;
	private Date fecha_alta;
	private Date fecha_baja;
	private String observaciones;
	

	
	
	public Socios() {

	}

	public Socios(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String p_email) {
		email = p_email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String p_telefono) {
		telefono = p_telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String p_direccion) {
		direccion = p_direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String p_provincia) {
		provincia = p_provincia;
	}

	public Date getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Date p_fecha_alta) {
		fecha_alta = p_fecha_alta;
	}

	public Date getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(Date p_fecha_baja) {
		fecha_baja = p_fecha_baja;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String p_observaciones) {
		observaciones = p_observaciones;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	public int hashCode() {
		try {
			return Integer.parseInt(dni);
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

		final Socios other = (Socios) obj;
		if (!dni.equals(other.getDni()))
			return false;
		return true;
	}

}
