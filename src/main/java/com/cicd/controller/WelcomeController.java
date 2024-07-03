package com.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value = "/welcome")
    public  static ResponseEntity welcome(){
        return ResponseEntity.ok("welcome to ci-cd demo module");
    }

}
