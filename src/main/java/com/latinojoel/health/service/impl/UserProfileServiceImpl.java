package com.latinojoel.health.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latinojoel.health.dao.UserProfileDao;
import com.latinojoel.health.model.UserProfile;
import com.latinojoel.health.service.UserProfileService;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

  @Autowired
  UserProfileDao dao;

  public List<UserProfile> findAll() {
    return dao.findAll();
  }

  public UserProfile findByType(String type) {
    return dao.findByType(type);
  }

  public UserProfile findById(int id) {
    return dao.findById(id);
  }
}
