package com.latinojoel.health.dao;

import java.util.List;

import com.latinojoel.health.model.User;

public interface UserDao {

  void save(User user);

  User findById(int id);

  User findByEmail(String email);
  
  List<User> getUsers();

}

