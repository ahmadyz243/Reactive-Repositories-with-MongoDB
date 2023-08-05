package com.ahmad.reactivemongodb.controller.rest;

import com.ahmad.reactivemongodb.dto.AccountDto;
import com.ahmad.reactivemongodb.service.ReactiveMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private ReactiveMongoService service;


    @GetMapping
    public Flux<AccountDto> finaAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<AccountDto> findById(@PathVariable String id){
        return service.findById(id);
    }

    @GetMapping("/find-in-range")
    public Flux<AccountDto> findInRAnge(@RequestParam("min") double min, @RequestParam("max") double max){
        return service.findByValueInRange(min, max);
    }

    @PostMapping
    public Mono<AccountDto> save(@RequestBody Mono<AccountDto> accountDtoMono){
        return service.save(accountDtoMono);
    }

    @PutMapping("/update/{id}")
    public Mono<AccountDto> update(@RequestBody Mono<AccountDto> accountDtoMono, @PathVariable String id){
        return service.update(accountDtoMono, id);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> delete(@PathVariable String id){
        return service.delete(id);
    }

}
