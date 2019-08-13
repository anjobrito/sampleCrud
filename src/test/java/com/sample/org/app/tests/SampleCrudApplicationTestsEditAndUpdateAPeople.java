 package com.sample.org.app.tests;

import java.util.Comparator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sample.org.app.model.People;
import com.sample.org.app.services.PeopleService;
import com.sample.org.app.setting.RegState;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleCrudApplicationTestsEditAndUpdateAPeople {
	
		
	@Autowired
	PeopleService peopleService;
	People people ;

	@Test
	public void contextLoads() {				
		this.people  =  peopleService.showAllPeople().stream().max(Comparator.comparing(People::getIdpeople)).get();		
		this.EditAExistentPeople();
		
	}
	

	public void EditAExistentPeople() {
		this.people.setStatus(RegState.INCOMPLETE);
		peopleService.save(people);
		
	}

}
