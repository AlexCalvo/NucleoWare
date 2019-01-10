package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	ProyectosRepository proyectosRepository;
	
	public List<Proyectos> getAll(){
		return proyectosRepository.findAll();
	}
	
	public Proyectos getById(String id) {
		return proyectosRepository.getOne(id);
	}
	
	public void add(Proyectos pr) {
		proyectosRepository.save(pr);
	}
	
	public void update(Proyectos proyecto) {
		Proyectos p = proyectosRepository.getOne(proyecto.getId());
		p.setTipo(proyecto.getTipo());
		
		p.setDescripcion(proyecto.getDescripcion());
		proyectosRepository.saveAndFlush(p);
	}
	
	public void delete(String id) {
		proyectosRepository.deleteById(id);
	}
	
}
