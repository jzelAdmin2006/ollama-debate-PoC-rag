package com.jzel.ollamadebatepocrag.rest;

import com.jzel.ollamadebatepocrag.service.PartyPlatformRagService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rag")
class PartyPlatformRagController {

  private final PartyPlatformRagService service;
  private final VectorStore vectorStore;

  @PostMapping
  String generateRagSummary(@RequestBody final String input) {
    return service.generateRagSummary(vectorStore, input);
  }
}
