package com.example.docker_study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/api")
public class Controller {

    @GetMapping
    public ResponseEntity<?> hello() {
        return ResponseEntity.ok().body(Map.of("message", "Hello World"));
    }
}
