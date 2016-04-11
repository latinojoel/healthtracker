package com.latinojoel.health.service;

import java.util.List;

import com.latinojoel.health.model.UserProfile;

public interface UserProfileService {

  List<UserProfile> findAll();

  UserProfile findByType(String type);

  UserProfile findById(int id);
}
