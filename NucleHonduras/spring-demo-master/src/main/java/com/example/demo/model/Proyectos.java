package com.example.demo.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proyectos {
	
	public enum TipoProyecto{
		CCJ,POPULORUM
	}
	
	@Id
	private String id;
	private TipoProyecto tipo;
	private String descripcion;
	
	
	public Proyectos() {

	}

	public Proyectos(String id,String descripcion,TipoProyecto tipo) {
		
		this.id = id;
		this.descripcion=descripcion;
		this.tipo=tipo;
		
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoProyecto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProyecto tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + "]";
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

		final Proyectos other = (Proyectos) obj;
		if (!id.equals(other.getId()))
			return false;
		return true;
	}

}
