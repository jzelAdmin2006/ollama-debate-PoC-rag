package com.jzel.ollamadebatepocrag.config;

import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TokenTextConfig {

  @Bean
  public TokenTextSplitter splitter() {
    return new TokenTextSplitter();
  }
}
