package com.mps.vibestemptation.service.impl;

import java.util.List;

import com.mps.vibestemptation.dao.ProductDAO;
import com.mps.vibestemptation.model.Product;
import com.mps.vibestemptation.service.ProductService;

public class ProductServiceImpl implements ProductService{

	ProductDAO productDAO;
	
	@Override
	public Product create() {
		return new Product();
	}

	@Override
	public void save(Product product) {
		productDAO.save(product);
	}

	@Override
	public void update(Product product) {
		productDAO.update(product);
	}

	@Override
	public void delete(Product product) {
		productDAO.delete(product);
	}

	@Override
	public Product findbyId(int id) {
		return productDAO.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

}
