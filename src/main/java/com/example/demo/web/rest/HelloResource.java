package com.example.demo.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class HelloResource {

    @GetMapping
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Welcome to Spring EC2");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> greetById(@PathVariable("id") String id) {
        return ResponseEntity.ok("Hello, your ID is: " + id);
    }
}
