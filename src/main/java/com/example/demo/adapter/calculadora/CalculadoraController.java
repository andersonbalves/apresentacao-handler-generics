package com.example.demo.adapter.calculadora;

import com.example.demo.service.calculadora.Calculadora;
import com.example.demo.service.calculadora.model.CalculadoraDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("calculadora")
@RequiredArgsConstructor
@Slf4j
public class CalculadoraController {

    private final List<Calculadora> calculadoras;

    @GetMapping("/calcular")
    @ResponseStatus(HttpStatus.OK)
    public Number calcular(@RequestParam int a, @RequestParam int b, @RequestParam String operador) {
        CalculadoraDTO dto = CalculadoraDTO.builder()
                .a(a)
                .b(b)
                .operador(operador)
                .build();
        log.info("Request: {}", dto);
        return calculadoras.stream()
                .filter(c -> c.canHandle(dto))
                .findFirst()
                .map(c -> c.handle(dto))
                .orElseThrow(() -> new IllegalArgumentException("Não foi possível calcular o valor para os parâmetros informados"));
    }
}
