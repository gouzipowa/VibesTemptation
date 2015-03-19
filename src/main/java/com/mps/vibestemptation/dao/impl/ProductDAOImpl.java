package com.mps.vibestemptation.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.mps.vibestemptation.dao.ProductDAO;
import com.mps.vibestemptation.model.Product;

public class ProductDAOImpl implements ProductDAO{

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public Product create() {
		return new Product();
	}

	@Override
	public void save(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	@Override
	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
	}

	@Override
	public void delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
	}

	@Override
	public Product findById(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		List<Product> products = sessionFactory.getCurrentSession()
				.createQuery("from Product").list();
		return products;
	}

}
