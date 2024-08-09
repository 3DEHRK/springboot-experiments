package com.example.demo.phrases;

import com.example.demo.phrases.en.PhraseEnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phrases")
public class PhraseController {

    @Autowired
    private PhraseEnRepository phraseEnRepository;

    @Autowired
    private PhraseMapper phraseMapper;

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
