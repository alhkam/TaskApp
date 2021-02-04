package com.ingeteam.taskapp.service;

import com.ingeteam.taskapp.entity.User;

public interface UserService {

	public User getUserByEmail(String email);
}
