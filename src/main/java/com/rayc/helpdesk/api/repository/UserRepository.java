package com.rayc.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rayc.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);
}
