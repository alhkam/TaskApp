package com.ingeteam.taskapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ingeteam.taskapp.entity.User;
import com.ingeteam.taskapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;
	
	@Override
	public User getUserByEmail(String email) {
		return repository.findByEmail(email);
	}

}
