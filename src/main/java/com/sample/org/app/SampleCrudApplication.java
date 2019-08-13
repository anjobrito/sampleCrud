package com.sample.org.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author André José de Brito 
 * */
@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class SampleCrudApplication{

	public static void main(String[] args) {
		SpringApplication.run(SampleCrudApplication.class, args);
	}

}
