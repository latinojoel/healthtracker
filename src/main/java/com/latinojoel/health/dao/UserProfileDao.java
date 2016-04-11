package com.latinojoel.health.dao;

import java.util.List;

import com.latinojoel.health.model.UserProfile;

public interface UserProfileDao {

  List<UserProfile> findAll();

  UserProfile findByType(String type);

  UserProfile findById(int id);
}
