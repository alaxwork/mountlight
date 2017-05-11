package com.alaxat;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class MyController {

    @GetMapping("/info")
    Mono<Customer> getInfo() {
        return Mono.just(new Customer().setName("test user"));
    }
}
