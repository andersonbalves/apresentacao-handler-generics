package com.example.demo.service.calculadora.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
public class CalculadoraDTO {
    private final Integer a;
    private final Integer b;
    private final String operador;
}
