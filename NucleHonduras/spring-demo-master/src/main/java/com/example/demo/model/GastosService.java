		package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GastosService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	GastosRepository gastosRepository;
	
	public List<Gastos> getAll(){
		return gastosRepository.findAll();
	}
	
	public Gastos getById(Long id) {
		return gastosRepository.getOne(id);
	}
	
	public void add(Gastos pr) {
		gastosRepository.save(pr);
	}
	
	public void update(Gastos gasto) {
		Gastos g = gastosRepository.getOne(gasto.getId());
		g.setIsVerified(gasto.getIsVerified());;
		g.setFecha(gasto.getFecha());
		g.setDestinatario(gasto.getDestinatario());
		g.setCantidad(gasto.getCantidad());
		g.setDescripcion(gasto.getDescripcion());
		gastosRepository.saveAndFlush(g);
	}
	
	public void delete(Long id) {
		gastosRepository.deleteById(id);
	}
	
}
