package com.waplak.pawn.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waplak.pawn.repository.UserRepository;
import com.waplak.pawn.repository.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	@Override
	public User getUserDetails(String userName) {
		User user=userRepository.findByUserName(userName);
		return user;
	}
	@Override
	public User submitUserDetails(User user) {
		return userRepository.save(user);
	}
	

}
