package com.example.demo.service.calculadora.impl;

import com.example.demo.service.calculadora.Calculadora;
import com.example.demo.service.calculadora.model.CalculadoraDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculadoraMultiplicacaoImpl implements Calculadora {

  @Override
  public Boolean canHandle(CalculadoraDTO req) {
    return "*".equals(req.getOperador()) || "X".equals(req.getOperador())
        || "multiplicar".equalsIgnoreCase(req.getOperador());
  }

  @Override
  public Integer handle(CalculadoraDTO req) {
    log.info("Executando Multiplicação: {}", req);
    return req.getA() * req.getB();
  }
}
