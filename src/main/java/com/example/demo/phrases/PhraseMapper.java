package com.example.demo.phrases;

import com.example.demo.phrases.en.PhraseEn;
import com.example.demo.phrases.en.PhraseEnDTO;
import com.example.demo.phrases.ru.PhraseRu;
import com.example.demo.phrases.ru.PhraseRuDTO;
import com.example.demo.phrases.sp.PhraseSp;
import com.example.demo.phrases.sp.PhraseSpDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PhraseMapper {
    PhraseEnDTO toPhraseEnDTO(PhraseEn phraseEn);

    PhraseRuDTO toPhraseRuDTO(PhraseRu phraseRu);

    PhraseSpDTO toPhraseSpDTO(PhraseSp phraseSp);

    @Mapping(source = "phraseEnId", target = "phraseEn.id")
    PhraseRu toPhraseRu(PhraseRuDTO phraseRuDTO);

    @Mapping(source = "phraseEnId", target = "phraseEn.id")
    PhraseSp toPhraseSp(PhraseSpDTO phraseSpDTO);

    PhraseEn toPhraseEn(PhraseEnDTO phraseEnDTO);
}
