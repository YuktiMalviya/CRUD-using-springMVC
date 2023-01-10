package com.ksolves.service;

import java.util.List;

import com.ksolves.entity.User;

public interface UserService {

	public void insert(User user);
	public List<User> fetchAllUsers();
}
