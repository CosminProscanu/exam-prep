package com.examprep.exampreparation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController   // - we expose the server's endpoints to whoever wants
public class DefaultController {

    @GetMapping ("/hello") // HTTP requests: GET,POST,PUT,DELETE - if we want to get info from the server we use GET
    public String hello() {
        return "The default controller is working fine!";
    }
}
