package com.latinojoel.health.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.latinojoel.health.dao.AbstractDao;
import com.latinojoel.health.dao.HypertensionDao;
import com.latinojoel.health.model.HypertensionRecord;
import com.latinojoel.health.model.User;

@Repository("hypertensionDao")
public class HypertensionDaoImpl extends AbstractDao<Integer, HypertensionRecord>
    implements HypertensionDao {

  public void save(HypertensionRecord hypertensionRecord) {
    final Session session = getSession();
    final Transaction trans = session.beginTransaction();
    persist(hypertensionRecord);
    trans.commit();
  }

  public HypertensionRecord findById(int id) {
    return getByKey(id);
  }

  public List<HypertensionRecord> getHypertensionsByUserId(User id) {
    final Session session = getSession();
    final Transaction trans = session.beginTransaction();
    List<HypertensionRecord> list=session.createCriteria(HypertensionRecord.class).add(Restrictions.eq("user", id)).list();
    trans.commit();
    return list;
  }

}
