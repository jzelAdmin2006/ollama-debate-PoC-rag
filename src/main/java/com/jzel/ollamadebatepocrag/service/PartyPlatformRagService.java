package com.jzel.ollamadebatepocrag.service;

import static java.util.stream.Collectors.joining;
import static org.springframework.ai.vectorstore.SearchRequest.query;

import jakarta.annotation.PostConstruct;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyPlatformRagService {

  private final ChatClient ragClient;

  @Value("classpath:/prompts/rag-prompt-template.st")
  private Resource ragPromptTemplate;

  private PromptTemplate template;

  @PostConstruct
  void init() {
    template = new PromptTemplate(ragPromptTemplate);
  }

  public String generateRagSummary(final VectorStore vectorStore, final String input) {
    return ragClient
        .prompt(template.create(
            Map.of(
                "topic", input,
                "document",
                vectorStore.similaritySearch(query(input).withTopK(2)).stream()
                    .map(Document::getContent)
                    .collect(joining("\n"))
            )
        ))
        .call()
        .content();
  }
}
