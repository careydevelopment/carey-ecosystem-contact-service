package com.careydevelopment.contact.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careydevelopment.global.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	public User findByUsername(String username);
	
	public User findByEmail(String email);
	
//    @Query("{ 'name' : ?0 }")
//    List<User> findUsersByName(String name);
//
//    @Query("{ 'age' : { $gt: ?0, $lt: ?1 } }")
//    List<User> findUsersByAgeBetween(int ageGT, int ageLT);
//
//    @Query("{ 'name' : { $regex: ?0 } }")
//    List<User> findUsersByRegexpName(String regexp);

}
