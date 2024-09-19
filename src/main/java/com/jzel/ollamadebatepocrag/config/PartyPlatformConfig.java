package com.jzel.ollamadebatepocrag.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "documents.politics.platform")
public record PartyPlatformConfig(String party) {

  public String getClasspath() {
    return STR."/docs/\{party}-party-platform-2024.txt";
  }
}
