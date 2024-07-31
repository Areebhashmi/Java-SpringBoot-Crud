package com.areeb.crud.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringBootCrudApplication implements CommandLineRunner {
@Autowired
env ENV;


   public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	System.out.println(ENV.getEnvironment());
	}
}
