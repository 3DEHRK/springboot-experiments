package com.example.demo.repository;

import com.example.demo.entity.Sentence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentenceRepo extends JpaRepository<Sentence, Long> {}
