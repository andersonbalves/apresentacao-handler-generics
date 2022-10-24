package com.example.demo.service.generics;

import com.example.demo.service.generics.model.Request;
import com.example.demo.service.generics.model.Response;

public interface Generics<I extends Request, O extends Response> {

  O execute(I request, O response);
}
