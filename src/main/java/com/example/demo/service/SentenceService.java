package com.example.demo.service;

import com.example.demo.dto.SentenceDTO;
import com.example.demo.entity.Sentence;
import com.example.demo.mapper.SentenceMapper;
import com.example.demo.repository.SentenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SentenceService {

    @Autowired
    private SentenceRepo sentenceRepo;

    @Autowired
    private SentenceMapper sentenceMapper;

    public List<SentenceDTO> getAllSentences() {
        return sentenceRepo.findAll().stream()
                .map(sentenceMapper::toDTO)
                .collect(Collectors.toList());
    }

    public SentenceDTO createSentence() {
        return sentenceMapper.toDTO(sentenceRepo.save(new Sentence()));
    }
}
