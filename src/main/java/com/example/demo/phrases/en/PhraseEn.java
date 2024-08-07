package com.example.demo.phrases.en;

import com.example.demo.phrases.ru.PhraseRu;
import com.example.demo.phrases.sp.PhraseSp;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PhraseEn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @OneToOne(mappedBy = "phraseEn", cascade = CascadeType.ALL, orphanRemoval = true)
    private PhraseRu russianTranslation;

    @OneToOne(mappedBy = "phraseEn", cascade = CascadeType.ALL, orphanRemoval = true)
    private PhraseSp spanishTranslation;
}
