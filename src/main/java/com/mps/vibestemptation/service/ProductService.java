package com.mps.vibestemptation.service;

import java.util.List;

import com.mps.vibestemptation.model.Product;

public interface ProductService {
	public Product create();
	public void save(Product product);
	public void update(Product product);
	public void delete(Product product);
	public Product findbyId(int id);
	public List<Product> findAll();
}
