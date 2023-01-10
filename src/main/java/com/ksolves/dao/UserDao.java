package com.ksolves.dao;

import java.util.List;

import com.ksolves.entity.User;

public interface UserDao {

	public void insert(User user);
	public List<User> fetchAllUsers();
}
