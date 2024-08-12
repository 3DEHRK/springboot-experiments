package com.example.demo.mapper;

import com.example.demo.dto.LanguageDTO;
import com.example.demo.entity.Language;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LanguageMapper {

    LanguageDTO toDTO(Language language);

    Language toEntity(LanguageDTO languageDTO);
}
