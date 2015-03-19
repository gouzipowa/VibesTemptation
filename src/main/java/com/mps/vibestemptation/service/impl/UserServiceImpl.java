package com.mps.vibestemptation.service.impl;

import java.util.List;

import com.mps.vibestemptation.dao.UserDAO;
import com.mps.vibestemptation.model.User;
import com.mps.vibestemptation.service.UserService;

public class UserServiceImpl implements UserService{

	UserDAO userDAO;
	
	@Override
	public User create() {
		return new User();
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}

	@Override
	public void delete(User user) {
		userDAO.delete(user);
	}

	@Override
	public User findbyId(int id) {
		return userDAO.findById(id);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public List<User> findByAge(int age) {
		return userDAO.findByAge(age);
	}

}
