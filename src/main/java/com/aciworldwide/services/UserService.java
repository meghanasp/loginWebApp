package com.aciworldwide.services;

import org.springframework.stereotype.Service;

import com.aciworldwide.entities.User;

//Business layer interface-Model Inteface

public interface UserService {

	
	//Business logic specification
	
	boolean isValid(User user);
	
}
