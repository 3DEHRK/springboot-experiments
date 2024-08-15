package com.example.demo.mapper;

import com.example.demo.dto.SentenceDTO;
import com.example.demo.entity.Sentence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SentenceMapper {

    SentenceDTO toDTO(Sentence sentence);

    Sentence toEntity(SentenceDTO sentenceDTO);
}
