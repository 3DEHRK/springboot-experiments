package com.example.demo.controller;

import com.example.demo.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("translation")
public class TranslationController {

    @Autowired
    private TranslationService translationService;

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
