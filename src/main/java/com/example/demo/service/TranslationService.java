package com.example.demo.service;

import com.example.demo.dto.TranslationDTO;
import com.example.demo.entity.Language;
import com.example.demo.entity.Sentence;
import com.example.demo.entity.Translation;
import com.example.demo.mapper.TranslationMapper;
import com.example.demo.repository.LanguageRepo;
import com.example.demo.repository.SentenceRepo;
import com.example.demo.repository.TranslationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //maybeh remové this :p
    public TranslationDTO createTranslation(TranslationDTO translationDTO) {
        Translation translation = translationMapper.toEntity(translationDTO);
        return translationMapper.toDTO(translationRepo.save(translation));
    }

    //todo: U

    public ResponseEntity<Void> deleteTranslation(Long id) {
        if (translationRepo.existsById(id)) {
            translationRepo.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<TranslationDTO> getTranslationBySentenceIdAndLanguageId(Long sentenceId, Long languageId) {
        return translationRepo.findBySentenceIdAndLanguageId(sentenceId, languageId)
                .map(translationMapper::toDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<TranslationDTO> createTranslateSentence(Long sentenceId, Long languageId, String translationText) {
        Sentence sentence = sentenceRepo.findById(sentenceId)
                .orElseThrow(() -> new RuntimeException("Sentence not found"));

        Language language = languageRepo.findById(languageId)
                .orElseThrow(() -> new RuntimeException("Language not found"));

        Translation translation = Translation.builder()
                .sentence(sentence)
                .language(language)
                .translationText(translationText)
                .build();

        translation = translationRepo.save(translation);
        return ResponseEntity.ok(translationMapper.toDTO(translation));
    }
}
