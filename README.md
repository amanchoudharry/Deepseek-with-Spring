# Ollama Spring Boot Project

## Introduction
This project integrates Ollama and DeepSeek with a Spring Boot backend. It provides functionality for AI model inference using locally installed DeepSeek models.

---

## Prerequisites
Ensure that you have the following installed on your system:

### 1. Install Ollama
Ollama is required to run the models locally. You can install it by following the instructions below:

#### **For Linux & Mac:**
```sh
curl -fsSL https://ollama.com/install.sh | sh
```

#### **For Windows:**
Download and install Ollama from [Ollama's official website](https://ollama.com/).

Verify installation by running:
```sh
ollama --version
```

### 2. Install DeepSeek Locally
DeepSeek is an AI model used in this project. You can install it using Ollama:

```sh
ollama pull deepseek with_model_version
```

Ensure it is installed by running:
```sh
ollama list
```
You should see `deepseek` in the list of installed models.

---

## Configuration
The model used in this application can be modified in the `application.properties` file.

### Change DeepSeek Model
Locate the following property inside `src/main/resources/application.properties`:

```properties
ollama.model=deepseek
```

To use a different model, replace `deepseek` with your desired model name. Example:
```properties
ollama.model=deepseek-coder
```

---

## Running the Application
After setting up Ollama and DeepSeek, you can start the Spring Boot application using:

```sh
mvn spring-boot:run
```

---

## Troubleshooting
- Ensure Ollama is running in the background before starting the application.
- If you get an error related to DeepSeek, confirm that it is installed correctly using `ollama list`.
- Check the logs for specific errors and update the `application.properties` file accordingly.

---

