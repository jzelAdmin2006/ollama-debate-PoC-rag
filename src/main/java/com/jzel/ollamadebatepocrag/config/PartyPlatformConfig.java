package com.jzel.ollamadebatepocrag.config;

import static java.lang.StringTemplate.STR;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "documents.politics.platform")
public record PartyPlatformConfig(String party) {

  public String getClasspath() {
    return STR."classpath:/docs/\{party}-party-platform-2024.txt";
  }
}
