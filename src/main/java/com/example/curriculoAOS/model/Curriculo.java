package com.example.curriculoAOS.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Entity
@Data
public class Curriculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    private Integer age;

    @NotNull
    private String email;

    private Integer phoneNumber;

    private String currentJob;

    private Integer expYears;


}
