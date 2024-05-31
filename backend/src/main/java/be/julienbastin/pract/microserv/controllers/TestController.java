package be.julienbastin.pract.microserv.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping
    public Mono<String> hello() {
        return Mono.just("Hello2");
    }

}
