package com.waplak.pawn.service;

import com.waplak.pawn.repository.model.User;

public interface UserService {
	public User getUserDetails(String userName);
	public User submitUserDetails(User user);
}
