package com.ahmad.reactivemongodb.repository;

import com.ahmad.reactivemongodb.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Repository
public interface ReactiveCrudRepositoryExample extends org.springframework.data.repository.reactive.ReactiveCrudRepository<Account, String> {

    Flux<Account> findAllByValue(String value);
    Mono<Account> findFirstByOwner(Mono<String> owner);

}
