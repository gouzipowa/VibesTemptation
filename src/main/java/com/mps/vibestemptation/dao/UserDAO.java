package com.mps.vibestemptation.dao;

import java.util.List;

import com.mps.vibestemptation.model.User;

public interface UserDAO {
	public User create();
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public User findById(int id);
	public List<User> findAll();
	public List<User> findByAge(int age);
}
