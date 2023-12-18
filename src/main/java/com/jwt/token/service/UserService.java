package com.jwt.token.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.token.model.User;

@Service
public class UserService {

	private List<User> user=new ArrayList<>();

	public UserService() {
		user.add(new User(UUID.randomUUID().toString(),"ajay","ajay@gmail.com"));
		user.add(new User(UUID.randomUUID().toString(),"rah","raj@gmail.com"));
		user.add(new User(UUID.randomUUID().toString(),"rohit","rohit@gmail.com"));
	}
		
		public List<User> getUsers()
		{
			return this.user;
		}
	
}
