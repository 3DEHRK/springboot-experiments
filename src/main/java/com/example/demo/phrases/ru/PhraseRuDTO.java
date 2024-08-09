package com.example.demo.phrases.ru;

import lombok.Data;

@Data
public class PhraseRuDTO {
    private Long id;
    private String textLatin;
    private String textCyrillic;
    private Long phraseEnId;
}
