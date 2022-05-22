package com.jace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jace.entity.User;

import com.jace.dao.*;

@Service
public class UserServiceImpl implements UserService {
	
    
	@Autowired
	private UserJaceDao userDao;
	
	@Override
	public List<User> findAll() {
		return this.userDao.findAll();
	}
	
	@Override
	public Optional<User> findById(String dni) {
		return this.userDao.findById(dni);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public void deleteById(String dni) {
		userDao.deleteById(dni); 
	}

}
