package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;


//business layer interface implementer class-Model Class
@Service
public class UserServiceImpl implements UserService {

	//business logic method implementation
	@Override
	public boolean isValid(User user) {
		// TODO Auto-generated method stub
		
		//business logic
		if(user!=null && user.getUsername().equals("Meghana") && user.getPassword().equals("welcome"))
		{
			return true;
		}
		
		
		return false;
	}

}
