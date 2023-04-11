package com.mywebapp.webapp.controller;

import kong.unirest.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class UserController {

    @GetMapping(path = "/user")
    public String user() {
        return new JSONObject().put("name", "Vitor").toString();
    }
}
