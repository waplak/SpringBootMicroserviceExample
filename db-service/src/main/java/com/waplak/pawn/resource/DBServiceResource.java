package com.waplak.pawn.resource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waplak.pawn.repository.model.User;
import com.waplak.pawn.service.UserService;

@RestController
@RequestMapping("rest/db")
public class DBServiceResource {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/{userName}")
	public User getUsers(@PathVariable("userName")final String userName){
		
		return userService.getUserDetails(userName);
	}
	@PostMapping("/reg")
    public User saveUser(@RequestBody User user) {
    	return userService.submitUserDetails(user);
    	
    }
}
