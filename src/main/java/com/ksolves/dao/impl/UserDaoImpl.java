package com.ksolves.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksolves.dao.UserDao;
import com.ksolves.entity.User;
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
    SessionFactory sessionFactory;
	
	public void insert(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	}

	
	public List<User> fetchAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("FROM User");
		List<User> users = query.list();
		return users;
	}

}
