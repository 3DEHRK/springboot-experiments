package com.example.demo.controller;

import com.example.demo.dto.SentenceDTO;
import com.example.demo.service.SentenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("sentence")
public class SentenceController {

    @Autowired
    private SentenceService sentenceService;

    @GetMapping
    public List<SentenceDTO> getAllSentences() {
        return sentenceService.getAllSentences();
    }

    @PostMapping
    public SentenceDTO createSentence() {
        return sentenceService.createSentence();
    }
}
