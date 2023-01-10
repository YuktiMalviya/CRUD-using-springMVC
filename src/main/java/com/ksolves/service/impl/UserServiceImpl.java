package com.ksolves.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksolves.dao.UserDao;
import com.ksolves.entity.User;
import com.ksolves.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;
    
    
    
    public void insert(User user) {
        userDao.insert(user);
    }

    
    public List<User> fetchAllUsers() {
        
        return userDao.fetchAllUsers();
    }

}
