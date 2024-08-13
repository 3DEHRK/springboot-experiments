package com.example.demo.service;

import com.example.demo.mapper.TranslationMapper;
import com.example.demo.repository.LanguageRepo;
import com.example.demo.repository.SentenceRepo;
import com.example.demo.repository.TranslationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {

    @Autowired
    private TranslationRepo translationRepo;

    @Autowired
    private SentenceRepo sentenceRepo;

    @Autowired
    private LanguageRepo languageRepo;

    @Autowired
    private TranslationMapper translationMapper;

}
