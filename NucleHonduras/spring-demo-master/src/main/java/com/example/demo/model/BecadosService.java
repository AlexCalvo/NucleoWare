package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BecadosService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	BecadosRepository becadosRepository;
	
	public List<Becados> getAll(){
		return becadosRepository.findAll();
	}
	
	public Becados getById(String id) {
		return becadosRepository.getOne(id);
	}
	
	public void add(Becados becado) {
		becadosRepository.save(becado);
	}
	
	public void update(Becados becado) {
		Becados b = becadosRepository.getOne(becado.getId());
		b.setApellido(becado.getApellido());
		b.setNombre(becado.getNombre());
		b.setFecha_nacimiento(becado.getFecha_nacimiento());
		b.setFecha_ingreso_acoes(becado.getFecha_ingreso_acoes());
		b.setFecha_ingreso_proyecto(becado.getFecha_ingreso_proyecto());
		b.setFecha_salida_proyecto(becado.getFecha_salida_proyecto());
		b.setObservaciones(becado.getObservaciones());
		b.setProyecto(becado.getProyecto());
		becadosRepository.saveAndFlush(b);
	}
	
	public void delete(String id) {
		becadosRepository.deleteById(id);
	}
	
}
