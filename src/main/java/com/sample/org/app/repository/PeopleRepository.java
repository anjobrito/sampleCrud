package com.sample.org.app.repository;



import org.springframework.data.repository.CrudRepository;

import com.sample.org.app.model.People;


public interface PeopleRepository extends CrudRepository<People, Integer> { 
	

}
