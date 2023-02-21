package com.lcwd.user.service.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.repositories.UserRespository;
import com.lcwd.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRespository userRespository;
	
	@Override
	public User saveUser(User user) {
		
		System.out.println("Code in service impl ");
		return userRespository.save(user);
	    
	}

	@Override
	public List<User> getAllUser() {
		return (List<User>) userRespository.findAll();
	}

	@Override
	public User getUser(int userId) {
		return userRespository.findById(userId).orElse(null);
	}

}
