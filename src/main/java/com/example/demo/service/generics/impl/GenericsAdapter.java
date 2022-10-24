package com.example.demo.service.generics.impl;

import com.example.demo.service.generics.Generics;
import com.example.demo.service.generics.model.Request;
import com.example.demo.service.generics.model.Response;
import org.springframework.stereotype.Service;

@Service
public class GenericsAdapter implements Generics {

  @Override
  public Response execute(Request request, Response response) {
    return response.fromJson(request.toJson());
  }
}
