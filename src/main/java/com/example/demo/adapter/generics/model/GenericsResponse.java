package com.example.demo.adapter.generics.model;

import com.example.demo.service.generics.model.Response;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GenericsResponse implements Response {

  private String nome;
  private int idade;

  @Override
  public Response fromJson(String json) {
    return new Gson().fromJson(json, GenericsResponse.class);
  }
}
