package com.mps.vibestemptation.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mps.vibestemptation.dao.ReviewDAO;
import com.mps.vibestemptation.model.Review;

public class ReviewDAOImpl implements ReviewDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Review create() {
		return new Review();
	}

	@Override
	public void save(Review review) {
		sessionFactory.getCurrentSession().save(review);
	}

	@Override
	public void update(Review review) {
		sessionFactory.getCurrentSession().update(review);
	}

	@Override
	public void delete(Review review) {
		sessionFactory.getCurrentSession().delete(review);
	}

	@Override
	public Review findById(int id) {
		return (Review) sessionFactory.getCurrentSession()
				.get(Review.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Review> findAll() {
		List<Review> reviews = sessionFactory.getCurrentSession()
				.createQuery("from Review").list();
		return reviews;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Review> findByRating(int rating) {
		Criteria cr = sessionFactory.getCurrentSession()
				.createCriteria(Review.class);
		cr.add(Restrictions.eq("rating", rating));
		return cr.list();
	}

}
