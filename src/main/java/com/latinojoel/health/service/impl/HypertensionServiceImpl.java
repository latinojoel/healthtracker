package com.latinojoel.health.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latinojoel.health.dao.HypertensionDao;
import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.model.User;
import com.latinojoel.health.service.HypertensionService;

@Service("hypertensionService")
@Transactional
public class HypertensionServiceImpl implements HypertensionService {

  @Autowired
  private HypertensionDao dao;


  public void save(HypertensionRecord hypertensionRecord) {
    dao.save(hypertensionRecord);
  }

  public HypertensionRecord findById(int id) {
    return dao.findById(id);
  }

  public List<HypertensionRecord> getHypertensionsByUserId(User id) {
    return dao.getHypertensionsByUserId(id);
  }

  public void deleteHypertensionById(int id) {
    dao.deleteHypertensionById(id);
  }

}
