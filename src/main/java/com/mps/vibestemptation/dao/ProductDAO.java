package com.mps.vibestemptation.dao;

import java.util.List;

import com.mps.vibestemptation.model.Product;


public interface ProductDAO {
	public Product create();
	public void save(Product product);
	public void update(Product product);
	public void delete(Product product);
	public Product findById(int id);
	public List<Product> findAll();
}
