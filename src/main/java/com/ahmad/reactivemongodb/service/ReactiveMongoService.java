package com.ahmad.reactivemongodb.service;

import com.ahmad.reactivemongodb.repository.ReactiveMongoRepositoryExample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReactiveMongoService {

    private final ReactiveMongoRepositoryExample repository;

}
