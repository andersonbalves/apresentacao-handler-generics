package com.example.demo.adapter.generics;

import com.example.demo.adapter.generics.model.GenericsRequest;
import com.example.demo.adapter.generics.model.GenericsResponse;
import com.example.demo.service.generics.Generics;
import com.example.demo.service.generics.model.Response;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GenericsController {

  private final Generics<GenericsRequest, GenericsResponse> service;

  @GetMapping("/generics")
  @ResponseStatus(HttpStatus.OK)
  public Response execute(@RequestParam String nome, @RequestParam String sobrenome,
      @RequestParam int idade) {
    return service.execute(GenericsRequest.builder()
        .nome(nome)
        .sobrenome(sobrenome)
        .idade(idade)
        .build(), GenericsResponse.builder().build());
  }
}
