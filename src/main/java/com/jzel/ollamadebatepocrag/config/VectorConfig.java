package com.jzel.ollamadebatepocrag.config;

import static java.nio.charset.Charset.defaultCharset;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.reader.TextReader;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@RequiredArgsConstructor
public class VectorConfig {

  private final PartyPlatformConfig partyPlatformConfig;
  private final VectorStore vectorStore;
  private final TokenTextSplitter splitter;

  @PostConstruct
  void republicanVectorStore() {
    final TextReader reader = new TextReader(new ClassPathResource(partyPlatformConfig.getClasspath()));
    reader.setCharset(defaultCharset());
    vectorStore.add(splitter.split(reader.get()));
  }
}
