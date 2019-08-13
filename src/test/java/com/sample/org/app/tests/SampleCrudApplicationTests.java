 package com.sample.org.app.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleCrudApplicationTests {
	
		
	
	@Test
	public void contextLoads() {
	 new SampleCrudApplicationTestsCreateANewPeople();
	 new SampleCrudApplicationTestsDeleteAPeople();
	 new SampleCrudApplicationTestsEditAndUpdateAPeople();
	}
}
