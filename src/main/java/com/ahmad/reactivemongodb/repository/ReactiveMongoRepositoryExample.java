package com.ahmad.reactivemongodb.repository;

import com.ahmad.reactivemongodb.domain.Account;
import org.springframework.data.domain.Range;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ReactiveMongoRepositoryExample extends ReactiveMongoRepository<Account, String> {

    Flux<Account> findByValueBetween(Range<Double> valueRange);

}
