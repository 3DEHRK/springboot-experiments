package com.example.demo.service;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.entity.Language;
import com.example.demo.mapper.LanguageMapper;
import com.example.demo.repository.LanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepo languageRepo;

    @Autowired
    private LanguageMapper languageMapper;

    public List<LanguageDTO> getAllLanguages() {
        return languageRepo.findAll().stream()
                .map(languageMapper::toDTO)
                .collect(Collectors.toList());
    }

    public LanguageDTO createLanguage(LanguageDTO languageDTO) {
        Language language = languageMapper.toEntity(languageDTO);
        return languageMapper.toDTO(languageRepo.save(language));
    }
}
