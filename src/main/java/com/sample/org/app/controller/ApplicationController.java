package com.sample.org.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

@Controller
@EnableAutoConfiguration
@RestController
public class ApplicationController {
	
	@Autowired
	PeopleService peopleService;
	
	@RequestMapping("/")
	public String home() {		
		return "Wellcome to my application";
    }
	
	@GetMapping("/showAllPeople")
	public List<People> getAllPeoples() {		
		return peopleService.showAllPeople();
    }
	
	@PutMapping("/people/save")
	public ResponseEntity<People> savePeople(@RequestBody People people) throws Exception {
		return ResponseEntity.ok(peopleService.save(people));
	}
	
	@DeleteMapping("/people/delete/{idPeople}")
	public String delete(@PathVariable int idPeople) throws Exception {		 
		return peopleService.delete(idPeople);
	}
	
	@GetMapping("/people/edit/{idPeople}")
	public ResponseEntity<Optional<People>> updatePeople(@RequestBody People people,@PathVariable int idPeople) throws Exception {
		return ResponseEntity.ok(peopleService.editPeople(idPeople));
	}
	
	@PostMapping("/people/update/{idPeople}")
	public String saveUpdate(@RequestBody People people,@PathVariable int idPeople) throws Exception {
		return peopleService.update(people,idPeople);
	}	
	
}
