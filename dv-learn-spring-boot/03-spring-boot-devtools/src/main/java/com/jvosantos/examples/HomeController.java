package com.jvosantos.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @RequestMapping("/")
  public String home() {
    return "Hello Devtools";
  }
}
