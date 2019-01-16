package com.example.demo.model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngresosService {

	/*---Interfaz para la gestion de datos de Socios---*/
	@Autowired
	IngresosRepository ingresosRepository;
	
	public List<Ingresos> getAll(){
		return ingresosRepository.findAll();
	}
	
	public Ingresos getById(Long id) {
		return ingresosRepository.getOne(id);
	}
	
	public void add(Ingresos pr) {
		ingresosRepository.save(pr);
	}
	
	public void update(Ingresos ingreso) {
		Ingresos i = ingresosRepository.getOne(ingreso.getId());
		i.setFecha(ingreso.getFecha());
		i.setProcedencia(ingreso.getProcedencia());
		i.setCantidad(ingreso.getCantidad());
		i.setDescripcion(ingreso.getDescripcion());
		ingresosRepository.saveAndFlush(i);
	}
	
	public void delete(Long id) {
		ingresosRepository.deleteById(id);
	}
	
}
