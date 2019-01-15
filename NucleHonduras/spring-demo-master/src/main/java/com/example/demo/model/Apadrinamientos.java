/**
 * 
 */
package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Apadrinamientos {
	@Id
	private Long id;
	private String padrino;
	private String apadrinado;
	private Long agente;
	private Date fecha_creacion;
	private Date fecha_salida;
	private String observaciones;
	private Long cuota;
	
	public Apadrinamientos() {
		
	}
	
	public Apadrinamientos(Long id, String padrino, String apadrinado, Long agente, Date fecha_creacion,
			Date fecha_salida, String observaciones, Long cuota) {
		super();
		this.id = id;
		this.padrino = padrino;
		this.apadrinado = apadrinado;
		this.agente = agente;
		this.fecha_creacion = fecha_creacion;
		this.fecha_salida = fecha_salida;
		this.observaciones = observaciones;
		this.cuota = cuota;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long p_id) {
		id = p_id;
	}
	public String getPadrino() {
		return padrino;
	}
	public void setPadrino(String p_padrino) {
		padrino = p_padrino;
	}
	public String getApadrinado() {
		return apadrinado;
	}
	public void setApadrinado(String p_apadrinado) {
		apadrinado = p_apadrinado;
	}
	public Long getAgente() {
		return agente;
	}
	public void setAgente(Long p_agente) {
		agente = p_agente;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date p_fecha_creacion) {
		fecha_creacion = p_fecha_creacion;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date p_fecha_salida) {
		fecha_salida = p_fecha_salida;
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
		result = prime * result + ((agente == null) ? 0 : agente.hashCode());
		result = prime * result + ((apadrinado == null) ? 0 : apadrinado.hashCode());
		result = prime * result + ((cuota == null) ? 0 : cuota.hashCode());
		result = prime * result + ((fecha_creacion == null) ? 0 : fecha_creacion.hashCode());
		result = prime * result + ((fecha_salida == null) ? 0 : fecha_salida.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((padrino == null) ? 0 : padrino.hashCode());
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
		Apadrinamientos other = (Apadrinamientos) obj;
		if (agente == null) {
			if (other.agente != null)
				return false;
		} else if (!agente.equals(other.agente))
			return false;
		if (apadrinado == null) {
			if (other.apadrinado != null)
				return false;
		} else if (!apadrinado.equals(other.apadrinado))
			return false;
		if (cuota == null) {
			if (other.cuota != null)
				return false;
		} else if (!cuota.equals(other.cuota))
			return false;
		if (fecha_creacion == null) {
			if (other.fecha_creacion != null)
				return false;
		} else if (!fecha_creacion.equals(other.fecha_creacion))
			return false;
		if (fecha_salida == null) {
			if (other.fecha_salida != null)
				return false;
		} else if (!fecha_salida.equals(other.fecha_salida))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (padrino == null) {
			if (other.padrino != null)
				return false;
		} else if (!padrino.equals(other.padrino))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apadrinamientos [id=" + id + ", padrino=" + padrino + ", apadrinado=" + apadrinado + ", agente="
				+ agente + ", fecha_creacion=" + fecha_creacion + ", fecha_salida=" + fecha_salida + ", observaciones="
				+ observaciones + ", cuota=" + cuota + "]";
	}


	

}


