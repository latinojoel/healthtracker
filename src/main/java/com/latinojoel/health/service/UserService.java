package com.latinojoel.health.service;

import java.util.List;

import com.latinojoel.health.model.User;

public interface UserService {

  void save(User user);

  User findById(int id);

  User findByEmail(String email);

  List<User> getUsers();
  
}
