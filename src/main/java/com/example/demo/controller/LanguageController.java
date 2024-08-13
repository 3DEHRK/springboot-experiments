package com.example.demo.controller;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("language")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @GetMapping
    public List<LanguageDTO> getAllLanguages() {
        return languageService.getAllLanguages();
    }

    @PostMapping
    public LanguageDTO createLanguage(@RequestBody() LanguageDTO languageDTO) {
        return languageService.createLanguage(languageDTO);
    }
}
