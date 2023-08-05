package com.ahmad.reactivemongodb.service;

import com.ahmad.reactivemongodb.domain.Account;
import com.ahmad.reactivemongodb.dto.AccountDto;
import com.ahmad.reactivemongodb.mapper.AccountMapper;
import com.ahmad.reactivemongodb.repository.ReactiveMongoRepositoryExample;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Range;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveMongoService {

    @Autowired
    private ReactiveMongoRepositoryExample repository;

    public Flux<AccountDto> findAll(){
        return repository.findAll().map(AccountMapper::accountToAccountDto);
    }

    public Mono<AccountDto> findById(String id){
        return repository.findById(id).map(AccountMapper::accountToAccountDto);
    }

    public Flux<AccountDto> findByValueInRange(double min, double max){
        return repository.findByValueBetween(Range.closed(min, max)).map(AccountMapper::accountToAccountDto);
    }

    public Mono<AccountDto> save(Mono<AccountDto> dtoMono){
        return dtoMono.map(AccountMapper::accountDtoToAccount)
                .flatMap(repository::insert)
                .map(AccountMapper::accountToAccountDto);
    }

    public Mono<AccountDto> update(Mono<AccountDto> dtoMono, String id){
        return repository.findById(id)
                .flatMap(account -> dtoMono.map(AccountMapper::accountDtoToAccount).doOnNext(e -> e.setId(id)))
                .flatMap(repository::save)
                .map(AccountMapper::accountToAccountDto);
    }

    public Mono<Void> delete(String id){
        return repository.deleteById(id);
    }

}
