package com.carlosedolv.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosedolv.workshop.entities.User;
import com.carlosedolv.workshop.repositories.UserRepository;
import com.carlosedolv.workshop.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user) {
		repository.save(user);
		return user;
	}

	public void delete(Long id) {
		repository.delete(findById(id));
	}

	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateEntity(entity, obj);
		return repository.save(entity);
	}

	private void updateEntity(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
