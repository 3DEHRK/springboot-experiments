package com.example.demo.controller;

import com.example.demo.dto.TranslationDTO;
import com.example.demo.service.TranslationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("translation")
public class TranslationController {

    @Autowired
    private TranslationService translationService;

    @PostMapping("boilerplate")
    public TranslationDTO createTranslation(@RequestBody TranslationDTO translationDTO) {
        return translationService.createTranslation(translationDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTranslation(@PathVariable Long id) {
        return translationService.deleteTranslation(id);
    }

    @GetMapping
    public ResponseEntity<TranslationDTO> getTranslationBySentenceIdAndLanguageId(
            @RequestParam Long sentenceId,
            @RequestParam Long languageId) {
        return translationService.getTranslationBySentenceIdAndLanguageId(sentenceId, languageId);
    }

    @PostMapping
    public ResponseEntity<TranslationDTO> translateSentence(
            @RequestParam Long sentenceId,
            @RequestParam Long languageId,
            @RequestParam String translationText) {
        return translationService.createTranslateSentence(sentenceId, languageId, translationText);
    }
}
