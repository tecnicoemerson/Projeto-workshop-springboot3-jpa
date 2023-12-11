package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repositoy;
	
	public List<User> findAll(){
		return repositoy.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repositoy.findById(id);
		return obj.get();
	}
	
}
