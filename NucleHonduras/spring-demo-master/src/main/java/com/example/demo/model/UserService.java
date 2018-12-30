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
	
	public void update(User user) {
		User p = userRepository.getOne(user.getId());
		p.setEmail(user.getEmail());
		p.setFirstName(user.getFirstName());
		p.setLastName(user.getLastName());
		p.setPassword(user.getPassword());
		userRepository.saveAndFlush(p);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
