package com.cristianRuizBlog.aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cristianRuizBlog.aplicacion.entity.User;
import com.cristianRuizBlog.aplicacion.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

	
	
}
