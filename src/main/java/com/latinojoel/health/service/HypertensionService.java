package com.latinojoel.health.service;

import java.util.List;

import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.model.User;

public interface HypertensionService {

  void save(HypertensionRecord hypertensionRecord);

  HypertensionRecord findById(int id);
  
  List<HypertensionRecord> getHypertensionsByUserId(User id);

}
