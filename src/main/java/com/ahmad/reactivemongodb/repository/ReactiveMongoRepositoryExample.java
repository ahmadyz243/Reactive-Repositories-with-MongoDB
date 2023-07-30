package com.ahmad.reactivemongodb.repository;

import com.ahmad.reactivemongodb.domain.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveMongoRepositoryExample extends ReactiveMongoRepository<Account, String> {



}
