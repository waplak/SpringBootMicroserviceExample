package com.waplak.pawn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waplak.pawn.repository.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String userName);
	User save(User user);
}
