 package com.sample.org.app.tests;

import java.util.Comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sample.org.app.model.People;
import com.sample.org.app.services.PeopleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleCrudApplicationTestsDeleteAPeople {
	
		
	@Autowired
	PeopleService peopleService;
	People people ;

	@Test
	public void contextLoads() {	
		this.people= new People();		
		this.people  =  peopleService.showAllPeople().stream().max(Comparator.comparing(People::getIdpeople)).get();		
		this.DeleteAExistentPeople();
	}	

	//Delete a Max Id People
	public void DeleteAExistentPeople() {	
     System.out.printf("Teste para %s",peopleService.delete(this.people.getIdpeople()));
	}
	

}
