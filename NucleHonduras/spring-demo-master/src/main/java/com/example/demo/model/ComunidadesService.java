package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComunidadesService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	ComunidadesRepository comunidadesRepository;
	
	public List<Comunidades> getAll(){
		return comunidadesRepository.findAll();
	}
	
	public Comunidades getById(String id) {
		return comunidadesRepository.getOne(id);
	}
	
	public void add(Comunidades comunidad) {
		comunidadesRepository.save(comunidad);
	}
	
	public void update(Comunidades comunidad) {
		Comunidades c = comunidadesRepository.getOne(comunidad.getId());
		c.setNombre(comunidad.getNombre());
		c.setUbicacion(comunidad.getUbicacion());
		c.setPoblacion(comunidad.getPoblacion());
		c.setNumeroNinos(comunidad.getNumeroNinos());
		c.setObservaciones(comunidad.getObservaciones());
		comunidadesRepository.saveAndFlush(c);
	}
	
	public void delete(String id) {
		comunidadesRepository.deleteById(id);
	}
	
}
