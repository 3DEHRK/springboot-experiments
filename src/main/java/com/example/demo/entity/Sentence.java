package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "sentences")
public class Sentence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*@Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "sentence", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Translation> translations;*/
}
