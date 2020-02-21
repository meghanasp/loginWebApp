package com.aciworldwide.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aciworldwide.entities.User;
import com.aciworldwide.services.UserService;


//Presentation layer-
//Request processing component of spring web mvc
@Controller
public class LoginController {
	
	//used to invoke business layer
	@Autowired
	private UserService userService;
	
	@RequestMapping("/signin") //handler mapping -to map request url with request processing method of controller 
	//request processing method
	
	private String validateUser(User user,ModelMap map) {
		
		//invoking business logic method of business layer(service)
		
		if(userService.isValid(user)) {
			map.addAttribute("uname", user.getUsername());
			return "success";
		}
		else
		{
			map.addAttribute("logonerror","Invalid Username/Password");//key value pair
			return "login";
		}
		
	}

}
