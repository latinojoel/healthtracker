package com.latinojoel.health.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.latinojoel.health.dao.UserDao;
import com.latinojoel.health.model.User;
import com.latinojoel.health.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao dao;

  @Autowired
  private PasswordEncoder passwordEncoder;

  public void save(User user) {
    user.setPassword(passwordEncoder.encode(user.getPassword()));
    dao.save(user);
  }

  public User findById(int id) {
    return dao.findById(id);
  }

  public User findByEmail(String email) {
    return dao.findByEmail(email);
  }

  public List<User> getUsers() {
	  return dao.getUsers();
  }
  
}
