 package com.sample.org.app.tests;

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
public class SampleCrudApplicationTestsCreateANewPeople {
	
		
	@Autowired
	PeopleService peopleService;
	People people ;	

	@Test
	public void contextLoads() {				
		this.CreateANewPeople();
	}
	
	//Create a new`People
	public void CreateANewPeople() {	
		
		People  people  = new People.PeopleBuilder()
				             .nome("Carlos Teste")
				             .cpf("00.000.040-00")
				             .endereco("Rua 3 Nº 70")
				             .nascimento( new java.sql.Date(0))				
				             .status(RegState.INATIVE)
				             .builder();
		peopleService.save(people);
		
	}	

}
