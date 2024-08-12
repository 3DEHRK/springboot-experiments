package com.example.demo.repository;

import com.example.demo.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepo extends JpaRepository<Language, Long> {}
