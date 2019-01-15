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
	
	//Añadir
	public void add(Socios socio) {
		socioRepository.saveAndFlush(socio);
	}
	
	//Editar
	public void update(Socios socio) {
		Socios p = socioRepository.getOne(socio.getDni());
		p.setApellido(socio.getApellido());
		p.setNombre(socio.getNombre());
		p.setDireccion(socio.getDireccion());
		p.setEmail(socio.getEmail());
		p.setFecha_alta(socio.getFecha_alta());
		p.setFecha_baja(socio.getFecha_baja());
		p.setObservaciones(socio.getObservaciones());
		p.setProvincia(socio.getProvincia());
		p.setTelefono(socio.getTelefono());
		p.setCuota(socio.getCuota());
		socioRepository.saveAndFlush(p);
	}
	
	//Borrar
	public void delete(String dni) {
		socioRepository.deleteById(dni);
	}
	
}
