package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BienesService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	BienesRepository bienesRepository;
	
	public List<Bienes> getAll(){
		return bienesRepository.findAll();
	}
	
	public Bienes getById(String id) {
		return bienesRepository.getOne(id);
	}
	
	public void add(Bienes bien) {
		bienesRepository.save(bien);
	}
	
	public void update(Bienes bien) {
		Bienes b = bienesRepository.getOne(bien.getId());
		b.setTipo(bien.getTipo());
		b.setCantidad(bien.getCantidad());
		b.setFecha(bien.getFecha());
		b.setProcedencia(bien.getProcedencia());
		b.setDescripcion(bien.getDescripcion());
		bienesRepository.saveAndFlush(b);
	}
	
	public void delete(String id) {
		bienesRepository.deleteById(id);
	}
	
}
