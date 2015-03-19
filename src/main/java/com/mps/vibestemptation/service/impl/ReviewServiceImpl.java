package com.mps.vibestemptation.service.impl;

import java.util.List;

import com.mps.vibestemptation.dao.ReviewDAO;
import com.mps.vibestemptation.model.Review;
import com.mps.vibestemptation.service.ReviewService;

public class ReviewServiceImpl implements ReviewService{

	ReviewDAO reviewDAO;
	
	@Override
	public Review create() {
		return new Review();
	}

	@Override
	public void save(Review review) {
		reviewDAO.save(review);
	}

	@Override
	public void update(Review review) {
		reviewDAO.update(review);
	}

	@Override
	public void delete(Review review) {
		reviewDAO.delete(review);
	}

	@Override
	public Review findbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findAll() {
		return reviewDAO.findAll();
	}

	@Override
	public List<Review> findByRating(int rating) {
		return reviewDAO.findByRating(rating);
	}

}
