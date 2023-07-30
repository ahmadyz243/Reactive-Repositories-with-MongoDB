package com.ahmad.reactivemongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveMongoDbApplication.class, args);

		/*
		// example of querying by ReactiveMongoRepository
		Flux<Account> accountFlux = repository
				.findAll(Example.of(new Account(null, "owner", null)));
		*/

	}

}
