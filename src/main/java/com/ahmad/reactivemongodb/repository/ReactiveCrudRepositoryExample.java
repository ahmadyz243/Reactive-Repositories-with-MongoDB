package com.ahmad.reactivemongodb.repository;

import com.ahmad.reactivemongodb.domain.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ReactiveCrudRepositoryExample extends ReactiveCrudRepository<Account, String> {

    Flux<Account> findAllByValue(String value);
    Mono<Account> findFirstByOwner(Mono<String> owner);

}