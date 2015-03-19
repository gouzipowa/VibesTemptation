package com.mps.vibestemptation.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mps.vibestemptation.dao.UserDAO;
import com.mps.vibestemptation.model.User;

public class UserDAOImpl implements UserDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public User create() {
		return new User();
	}

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Override
	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	@Override
	public User findById(int id) {
		return (User) sessionFactory.getCurrentSession()
				.get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		List<User> users = sessionFactory.getCurrentSession()
				.createQuery("from User").list();
		return users;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findByAge(int age) {
		Criteria cr = sessionFactory.getCurrentSession()
				.createCriteria(User.class);
		cr.add(Restrictions.eq("age", age));
		return cr.list();
	}

}
