package com.ollama_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration.class})
public class OllamaSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(OllamaSpringBootProjectApplication.class, args);
	}

}
