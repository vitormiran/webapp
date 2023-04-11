package com.mywebapp.webapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class StreamController {

    @GetMapping(path = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> stream() {
        return Flux.interval(Duration.ofSeconds(3)).map(
                value -> value + ":" + System.currentTimeMillis()
        );
    }

    //Tentar entender como formatar o html com div
    /*@GetMapping(path = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ModelAndView> stream() {
        ModelAndView modelAndView = new ModelAndView("index");
        return Flux.interval(Duration.ofSeconds(5)).map(value -> modelAndView.addObject("value", value).
                addObject("time", System.currentTimeMillis()));

    }*/

}

