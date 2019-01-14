package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApadrinamientosService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	ApadrinamientosRepository apadrinamientosRepository;
	
	public List<Apadrinamientos> getAll(){
		return apadrinamientosRepository.findAll();
	}
	
	public Apadrinamientos getById(Long id) {
		return apadrinamientosRepository.getOne(id);
	}
	
	public void add(Apadrinamientos becado) {
		apadrinamientosRepository.save(becado);
	}
	
	public void update(Apadrinamientos ap) {
		Apadrinamientos b = apadrinamientosRepository.getOne(ap.getId());
		b.setPadrino(ap.getPadrino());
		b.setApadrinado(ap.getApadrinado());
		b.setAgente(ap.getAgente());
		b.setFecha_creacion(ap.getFecha_creacion());
		b.setFecha_salida(ap.getFecha_salida());
		
		b.setObservaciones(ap.getObservaciones());
		
		apadrinamientosRepository.saveAndFlush(b);
	}
	
	public void delete(Long id) {
		apadrinamientosRepository.deleteById(id);
	}
	
}
