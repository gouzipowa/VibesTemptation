package com.mps.vibestemptation.dao;

import java.util.List;

import com.mps.vibestemptation.model.Review;


public interface ReviewDAO {
	public Review create();
	public void save(Review review);
	public void update(Review review);
	public void delete(Review review);
	public Review findById(int id);
	public List<Review> findAll();
	public List<Review> findByRating(int rating);
}
