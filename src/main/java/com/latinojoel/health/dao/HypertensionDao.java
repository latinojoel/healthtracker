package com.latinojoel.health.dao;

import java.util.List;

import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.model.User;

public interface HypertensionDao {

  void save(HypertensionRecord hypertensionRecord);

  HypertensionRecord findById(int id);

  List<HypertensionRecord> getHypertensionsByUserId(User id);

  void deleteHypertensionById(int id);
}

