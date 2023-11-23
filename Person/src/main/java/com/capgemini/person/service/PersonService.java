package com.capgemini.person.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.person.model.PersonApp;
import com.capgemini.person.repo.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public void savePerson(PersonApp person) {
		repository.save(person);
	}
	
	public PersonApp getPersonApp(String id) {
		return repository.findById(id).orElse(null);
	}
	public List<PersonApp> getAllPersons(){
		return repository.findAll();
	}
	public void deletePersonApp(String id) {
		repository.deleteById(id);
	}
	

}
