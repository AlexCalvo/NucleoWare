package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SociosService {
	
	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	SociosRepository socioRepository;
	
	public List<Socios> getAll() {
		return socioRepository.findAll();
	}
		
	public Socios getByDni(String id) {
		return socioRepository.getOne(id);
	}
	
	public void add(Socios socio) {
		socioRepository.save(socio);
	}
	
	public void update(Socios socio) {
		Socios p = socioRepository.getOne(socio.getDni());
		p.setApellido(socio.getApellido());
		p.setNombre(socio.getNombre());
		socioRepository.saveAndFlush(p);
	}
	
	public void delete(String dni) {
		socioRepository.deleteById(dni);
	}
	
}
