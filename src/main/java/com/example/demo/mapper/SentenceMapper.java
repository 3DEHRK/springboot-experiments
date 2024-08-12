package com.example.demo.mapper;

import com.example.demo.dto.SentenceDTO;
import com.example.demo.entity.Sentence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SentenceMapper {

    @Mapping(source = "translations", target = "translations")
    SentenceDTO toDTO(Sentence sentence);

    @Mapping(source = "translations", target = "translations")
    Sentence toEntity(SentenceDTO sentenceDTO);
}
