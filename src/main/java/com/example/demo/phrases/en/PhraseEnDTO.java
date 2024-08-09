package com.example.demo.phrases.en;

import com.example.demo.phrases.ru.PhraseRu;
import com.example.demo.phrases.sp.PhraseSp;
import lombok.Data;

@Data
public class PhraseEnDTO {
    private Long id;
    private String text;
    private PhraseRu russianTranslationId;
    private PhraseSp spanishTranslationId;
}
