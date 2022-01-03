package com.example.demospring.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
public class BookEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
}
