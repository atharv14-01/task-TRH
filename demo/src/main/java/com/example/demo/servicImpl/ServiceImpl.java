package com.example.demo.servicImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Entity;
import com.example.demo.repository.Repository;
import com.example.demo.service.ServiceS;


@Service
public class ServiceImpl implements ServiceS {
	@Autowired
	Repository repository;
	
	@Override
	public void save(Entity entity) {
		repository.save(entity);
	}
}
