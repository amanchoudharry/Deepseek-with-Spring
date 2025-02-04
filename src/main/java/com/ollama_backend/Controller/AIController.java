package com.ollama_backend.Controller;

import com.ollama_backend.service.AIService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/ai")
public class AIController {

    private AIService aiService;

    public AIController(AIService aiService){
        this.aiService=aiService;
    }

    @GetMapping
    public ResponseEntity<String> askAI(
            @RequestParam(value ="query",required = false,defaultValue = "How are you ? How can you help me?") String query
    ){
        String response = aiService.askAI(query);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("stream")
    public Flux<String> streamAI(
            @RequestParam(value ="query",required = false,defaultValue = "How are you ? How can you help me?") String query
    ){
        String response = aiService.askAI(query);
        return aiService.streamResponse(query);
    }
}
