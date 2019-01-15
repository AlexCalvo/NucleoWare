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
	private Long cuota;

	
	
	public Socios() {

	}

	public Socios(String dni, String nombre, String apellido, String email, String telefono, String direccion,
			String provincia, Date fecha_alta, Date fecha_baja, String observaciones, Long cuota) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.provincia = provincia;
		this.fecha_alta = fecha_alta;
		this.fecha_baja = fecha_baja;
		this.observaciones = observaciones;
		this.cuota = cuota;
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
	
	public Long getCuota() {
		return cuota;
	}

	public void setCuota(Long cuota) {
		this.cuota = cuota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cuota == null) ? 0 : cuota.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((fecha_alta == null) ? 0 : fecha_alta.hashCode());
		result = prime * result + ((fecha_baja == null) ? 0 : fecha_baja.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Socios other = (Socios) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cuota == null) {
			if (other.cuota != null)
				return false;
		} else if (!cuota.equals(other.cuota))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fecha_alta == null) {
			if (other.fecha_alta != null)
				return false;
		} else if (!fecha_alta.equals(other.fecha_alta))
			return false;
		if (fecha_baja == null) {
			if (other.fecha_baja != null)
				return false;
		} else if (!fecha_baja.equals(other.fecha_baja))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Socios [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", provincia=" + provincia + ", fecha_alta="
				+ fecha_alta + ", fecha_baja=" + fecha_baja + ", observaciones=" + observaciones + ", cuota=" + cuota
				+ "]";
	}

}
