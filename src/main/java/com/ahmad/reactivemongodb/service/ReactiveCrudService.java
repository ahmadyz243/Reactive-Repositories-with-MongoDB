package com.ahmad.reactivemongodb.service;

import com.ahmad.reactivemongodb.domain.Account;
import com.ahmad.reactivemongodb.repository.ReactiveCrudRepositoryExample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class ReactiveCrudService {

    private final ReactiveCrudRepositoryExample repository;

    public Mono<Account> save(Account account){
        return repository.save(account);
    }

    public Flux<Account> findAllByValue(String value){
        return repository.findAllByValue(value);
    }

    public Mono<Account> findFirstByOwner(Mono<String> owner){
        return repository.findFirstByOwner(owner);
    }

}
