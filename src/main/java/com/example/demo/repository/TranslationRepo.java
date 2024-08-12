package com.example.demo.repository;

import com.example.demo.entity.Translation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TranslationRepo extends JpaRepository<Translation, Long> {
    Optional<Translation> findBySentenceIdAndLanguageId(Long sentenceId, Long languageId);
}
