package com.mywebapp.webapp.controller;

import com.mywebapp.webapp.config.ContentCalendarProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/helloworld")
    public ContentCalendarProperties home() {
        return properties;
    }

}
