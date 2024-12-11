package com.example.Dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@IdClass(Person.class)
@Entity
public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private int phoneNumber;
    private String cityOfLiving;
}