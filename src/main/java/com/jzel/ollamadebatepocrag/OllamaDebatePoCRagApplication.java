package com.jzel.ollamadebatepocrag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.jzel.ollamadebatepocrag.config")
public class OllamaDebatePoCRagApplication {

  public static void main(String[] args) {
    SpringApplication.run(OllamaDebatePoCRagApplication.class, args);
  }

}
