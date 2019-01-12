package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAll(){
		return userRepository.findAll();
	}
	
	public User getById(Long id) {
		return userRepository.getOne(id);
	}
	
	public void add(User user) {
		userRepository.save(user);
	}
	
	public void update(User usuario) {
		User p = userRepository.getOne(usuario.getId());
		p.setApellidos(usuario.getApellidos());
		p.setEmail(usuario.getEmail());
		p.setFechaAlta(usuario.getFechaAlta());
		p.setFechaBaja(usuario.getFechaBaja());
		p.setNombre(usuario.getNombre());
		p.setObservaciones(usuario.getObservaciones());
		p.setPassword(usuario.getPassword());
		userRepository.saveAndFlush(p);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
