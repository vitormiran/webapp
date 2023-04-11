package com.mywebapp.webapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class FetchController {

    @GetMapping(path = "/fetch")
    public String stream() {
        return "<div id=\"hello\" hx-swap-oob=\"true\">Hello</div>\n"
                + "<div id=\"world\" hx-swap-oob=\"true\">World</div>";
    }
}
