package com.example.demo.adapter.generics.model;

import com.example.demo.service.generics.model.Request;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenericsRequest implements Request {

  private String nome;
  private String sobrenome;
  private int idade;

  @Override
  public String toJson() {
    return new Gson().toJson(this);
  }
}
