package com.mps.vibestemptation.service;

import java.util.List;

import com.mps.vibestemptation.model.User;

public interface UserService {
	public User create();
	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public User findbyId(int id);
	public List<User> findAll();
	public List<User> findByAge(int age);
}
