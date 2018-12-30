package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<Usuario> getAll(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getById(String id) {
		return usuarioRepository.getOne(id);
	}
	
	public void add(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void update(Usuario usuario) {
		Usuario p = usuarioRepository.getOne(usuario.getId());
		p.setApellidos(usuario.getApellidos());
		p.setEmail(usuario.getEmail());
		p.setFechaAlta(usuario.getFechaAlta());
		p.setFechaBaja(usuario.getFechaBaja());
		p.setNombre(usuario.getNombre());
		p.setObservaciones(usuario.getObservaciones());
		p.setPassword(usuario.getPassword());
		usuarioRepository.saveAndFlush(p);
	}
	
	public void delete(String id) {
		usuarioRepository.deleteById(id);
	}
}
