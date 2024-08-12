package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TranslationDTO {
    private Long id;
    private String translationText;
    private Long sentenceId;
    private LanguageDTO language;
}
