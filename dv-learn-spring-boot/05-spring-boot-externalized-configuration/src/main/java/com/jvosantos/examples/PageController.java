package com.jvosantos.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

  @Value("${pageController.message}")
  private String pageControllerMessage;

  @Value("${custom.secret}")
  private String customSecret;

  @RequestMapping("/")
  public String home() {
    return pageControllerMessage + " : " + customSecret;
  }
}
