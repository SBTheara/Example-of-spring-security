package com.intern.spring.security.SpringSecurity.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @GetMapping("/get")
    public String get(){
        return "Hello admin";
    }
}
