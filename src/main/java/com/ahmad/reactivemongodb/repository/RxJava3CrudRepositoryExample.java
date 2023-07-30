package com.ahmad.reactivemongodb.repository;

import com.ahmad.reactivemongodb.domain.Account;
import org.springframework.data.repository.reactive.RxJava3CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RxJava3CrudRepositoryExample extends RxJava3CrudRepository<Account, String> {

    List<Account> findAllByValue(Double value);
    Account findFirstByOwner(String owner);

}
