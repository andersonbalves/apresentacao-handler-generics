package com.example.demo.service.calculadora.impl;

import com.example.demo.service.calculadora.Calculadora;
import com.example.demo.service.calculadora.model.CalculadoraDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculadoraDivisaoImpl implements Calculadora {
    @Override
    public Boolean canHandle(CalculadoraDTO req) {
        return "/".equals(req.getOperador()) || "dividir".equalsIgnoreCase(req.getOperador());
    }

    @Override
    public Number handle(CalculadoraDTO req) {
        log.info("Executando Divisão: {}", req);
        return req.getA() / req.getB();
    }
}
