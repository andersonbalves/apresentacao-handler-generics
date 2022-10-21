package com.example.demo.service.calculadora;

import com.example.demo.service.calculadora.model.CalculadoraDTO;

public interface Calculadora {
    Boolean canHandle(CalculadoraDTO req);
    Number handle(CalculadoraDTO req);
}
