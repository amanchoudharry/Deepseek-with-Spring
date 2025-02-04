package com.ollama_backend.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AIServiceImpl implements AIService{
    private ChatClient client;

    public AIServiceImpl(ChatClient.Builder builder){
        this.client=builder.build();
    }

    @Override
    public String askAI(String question){
        return client.prompt(question).call().content();
    }

    public Flux<String> streamResponse(String question){
        return this.client.prompt().user(question).stream().content();
    }
}
