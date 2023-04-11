package com.mywebapp.webapp.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String greet(@ModelAttribute Greeting values) {
        return "Hello " + values.getValue() + " !";
    }

    static class Greeting {
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
