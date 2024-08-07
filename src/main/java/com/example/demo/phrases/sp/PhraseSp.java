package com.example.demo.phrases.sp;

import com.example.demo.phrases.en.PhraseEn;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PhraseSp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @OneToOne
    @JoinColumn(name = "phrase_en_id")
    private PhraseEn phraseEn;
}
