package com.ollama_backend.service;

import reactor.core.publisher.Flux;

public interface AIService {

    String askAI(String question);
    Flux<String> streamResponse(String question);
}
