package com.ahmad.reactivemongodb;

import com.ahmad.reactivemongodb.domain.Account;
import com.ahmad.reactivemongodb.service.ReactiveCrudService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ReactiveMongoDbApplicationTests {

	/*
	@Autowired
	public ReactiveMongoDbApplicationTests(ReactiveCrudService service){
		this.service = service;
	}

	private ReactiveCrudService service;
	//private final ReactiveMongoService service;
	//private final RxJava3CrudService service;


	@Test
	public void givenValue_whenFindAllByValue_thenFindAccount(){

		service.save(new Account(null, "Ahmad", 12.5)).block();
		Flux<Account> accountFlux = service.findAllByValue("12.5");

		StepVerifier
				.create(accountFlux)
				.assertNext(account -> {
					assertEquals("Ahmad", account.getOwner());
					assertEquals(Double.valueOf(12.5), account.getValue());
					assertNotNull(account.getId());
				})
				.expectComplete()
				.verify();

	}

	@Test
	public void givenOwner_whenFindFirstByOwner_thenFindAccount(){

		service.save(new Account(null, "Ali", 12.3)).block();
		Mono<Account> accountMono = service.findFirstByOwner(Mono.just("Ali"));

		StepVerifier
				.create(accountMono)
				.assertNext(account -> {
					assertEquals("Bill", account.getOwner());
					assertEquals(Double.valueOf(12.3) , account.getValue());
					assertNotNull(account.getId());
				})
				.expectComplete()
				.verify();

	}

	@Test
	public void givenAccount_whenSave_thenSaveAccount() {
		Mono<Account> accountMono = service.save(new Account(null, "Mammad", 18.3));

		StepVerifier
				.create(accountMono)
				.assertNext(account -> assertNotNull(account.getId()))
				.expectComplete()
				.verify();
	}
	*/

	@Test
	void contextLoads() {
	}

}
