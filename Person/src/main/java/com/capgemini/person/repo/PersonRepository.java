package com.capgemini.person.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.person.model.PersonApp;

public interface PersonRepository extends MongoRepository<PersonApp,String>{
	List<PersonApp> findAge(int age);
	

}
