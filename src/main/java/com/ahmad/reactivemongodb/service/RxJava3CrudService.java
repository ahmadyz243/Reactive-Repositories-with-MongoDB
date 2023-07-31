package com.ahmad.reactivemongodb.service;

import com.ahmad.reactivemongodb.repository.RxJava3CrudRepositoryExample;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RxJava3CrudService {

    private final RxJava3CrudRepositoryExample repository;

}
