package com.jzel.ollamadebatepocrag.config;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.ChatClient.Builder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ChatConfig {

  @Bean
  ChatClient client(final Builder builder) {
    return builder.build();
  }
}
