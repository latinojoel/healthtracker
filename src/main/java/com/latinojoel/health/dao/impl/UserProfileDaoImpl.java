package com.latinojoel.health.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.latinojoel.health.dao.AbstractDao;
import com.latinojoel.health.dao.UserProfileDao;
import com.latinojoel.health.model.UserProfile;

@Repository("userProfileDao")
public class UserProfileDaoImpl extends AbstractDao<Integer, UserProfile>
    implements UserProfileDao {

  @SuppressWarnings("unchecked")
  public List<UserProfile> findAll() {
    final Criteria crit = createEntityCriteria();
    crit.addOrder(Order.asc("type"));
    return (List<UserProfile>) crit.list();
  }

  public UserProfile findById(int id) {
    return getByKey(id);
  }

  public UserProfile findByType(String type) {
    final Criteria crit = createEntityCriteria();
    crit.add(Restrictions.eq("type", type));
    return (UserProfile) crit.uniqueResult();
  }
}
