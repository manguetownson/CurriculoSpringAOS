package com.example.curriculoAOS.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CurriculoDto {

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
