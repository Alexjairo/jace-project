package com.jace.service;
import java.util.List;
import java.util.Optional;

import com.jace.entity.User;

public interface UserService {
	
 public List<User> findAll();
 public Optional<User> findById(String userDni);
 public void save(User user);
 public void deleteById(String string);
}
