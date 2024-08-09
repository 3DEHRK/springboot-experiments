package com.example.demo.phrases.ru;

import com.example.demo.phrases.en.PhraseEn;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PhraseRu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String textLatin;
    private String textCyrillic;

    @OneToOne(mappedBy = "russianTranslation")
    private PhraseEn phraseEn;
}
