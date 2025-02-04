# Ollama AI Backend

This project provides an AI-powered backend service using **Spring Boot, Ollama, and DeepSeek** for processing and streaming AI-generated responses.

## Prerequisites

Ensure you have **Java 17+** installed on your system.

### Install Ollama Locally

1. Download and install Ollama from the official site:  
   [https://ollama.com/download](https://ollama.com/download)
2. Start Ollama:
   ```sh
   ollama serve
   ```

### Install DeepSeek Locally

1. Install DeepSeek:
   ```sh
   ollama pull deepseek
   ```
2. Run DeepSeek:
   ```sh
   ollama run deepseek 
   ```

## Configuration

### Change DeepSeek Model in `application.properties`

You can modify the **DeepSeek model** used by updating the following property in `src/main/resources/application.properties`:

```properties
ai.model=deepseek-large
```
Replace `deepseek-large` with your preferred model version, such as:
```properties
ai.model=deepseek-medium
```

## API Endpoints

The backend provides two endpoints to interact with the AI service:

### 1. Ask AI (Synchronous)

**Endpoint:** `GET /api/v1/ai`

- **Description:** Sends a query to the AI and receives a synchronous response.
- **Parameters:**
  - `query` (optional, string) - The question to ask the AI.
- **Response:** A single AI-generated text response.

#### Postman Example:

**Request:**
```
GET http://localhost:8080/api/v1/ai?query=Hello AI, how can you help me?
```

**Response:**
```json
{
    "response": "Hello! I can assist you with a variety of tasks, including answering questions, providing recommendations, and much more."
}
```

### 2. Stream AI (Asynchronous Response)

**Endpoint:** `GET /api/v1/ai/stream`

- **Description:** Streams AI responses asynchronously using `Flux<String>`.
- **Parameters:**
  - `query` (optional, string) - The question to ask the AI.
- **Response:** A continuous stream of AI-generated text.

#### Postman Example:

**Request:**
```
GET http://localhost:8080/api/v1/ai/stream?query=Tell me a story.
```

**Response:** (Streaming JSON lines)
```jsonl
"Once upon a time, in a distant kingdom..."
"there lived a wise old owl who..."
"helped villagers solve their problems."
```

## Running the Application

1. Clone the repository:
   ```sh
   git clone [https://github.com/your-repo/ollama-ai-backend.git](https://github.com/amanchoudharry/Deepseek-with-Spring.git)
   cd ollama-ai-backend
   ```
2. Build and run the project:
   ```sh
   mvn spring-boot:run
   ```

The service will start at `http://localhost:8080`.

## Testing with Postman

- Open **Postman** or any REST client.
- Use **GET** requests to test endpoints as described above.
- For streaming, enable **"Stream mode"** in Postman.
