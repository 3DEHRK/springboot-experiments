package com.example.demo.mapper;

import com.example.demo.dto.TranslationDTO;
import com.example.demo.entity.Translation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TranslationMapper {

    @Mapping(source = "sentence.id", target = "sentenceId")
    TranslationDTO toDTO(Translation translation);

    @Mapping(source = "sentenceId", target = "sentence.id")
    Translation toEntity(TranslationDTO translationDTO);
}
