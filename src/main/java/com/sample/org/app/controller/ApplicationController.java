package com.sample.org.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.org.app.model.People;
import com.sample.org.app.services.PeopleService;


@EnableAutoConfiguration
@RestController
@RequestMapping(path = "/people")
public class ApplicationController {
	
	@Autowired
	PeopleService peopleService;
	
	@RequestMapping("/")
	public String home() {		
		return "Wellcome to my application";
    }
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<People> getAllPeoples() {		
		return peopleService.showAllPeople();
    }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<People> savePeople(@RequestBody People people) throws Exception {
		return ResponseEntity.ok(peopleService.save(people));
	}
	
	@PutMapping(path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Optional<People>> updatePeople(@RequestBody People people,@PathVariable int idPeople) throws Exception {
		return ResponseEntity.ok(peopleService.editPeople(idPeople));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable int idPeople) throws Exception {		 
		return ResponseEntity.noContent().build();
	}
		
	
}
