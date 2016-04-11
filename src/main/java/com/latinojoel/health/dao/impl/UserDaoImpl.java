package com.latinojoel.health.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.latinojoel.health.dao.AbstractDao;
import com.latinojoel.health.dao.UserDao;
import com.latinojoel.health.model.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

  public void save(User user) {
    final Session session = getSession();
    final Transaction trans = session.beginTransaction();
    persist(user);
    trans.commit();
  }

  public User findById(int id) {
    return getByKey(id);
  }

  public User findByEmail(String email) {
    final Session session = getSession();
    final Transaction trans = session.beginTransaction();
    final Criteria crit = getSession().createCriteria(User.class);
    crit.add(Restrictions.eq("email", email));
    final User user = (User) crit.uniqueResult();
    trans.commit();
    return user;
  }

}
