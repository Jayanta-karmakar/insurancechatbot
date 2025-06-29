# Insurance Chatbot Backend - Demo API (Spring Boot)

## 📦 Installation

```bash
# Clone the repo
git clone https://github.com/Jayanta-karmakar/insurancechatbot.git
```

## Run the Project Locally

1. Open the project in your IDE (e.g., IntelliJ or Eclipse).
2. Ensure JDK 17+ is installed.
3. Build the project using Maven or Gradle.

**With Maven:**

```bash
./mvnw spring-boot:run
```

4. The application will start at:

```
http://localhost:8080
```

Test endpoints via Postman at `http://localhost:8080/api/chat`

## Endpoint

POST http://localhost:8080/api/chat

 Headers

Content-Type: application/json

🧾 Request Format

```
{
  "section": "<section-name>",
  "message": "<user message>"
}
```
---

## ✅ Sample Test Requests

### 1. 🚀 Apply for Policy

```json
{
  "section": "policy",
  "message": "apply"
}
```

### 2. 🧾 Check Claim Status

```json
{
  "section": "claims",
  "message": "check claim status"
}
```

### 3. 💰 Billing Info

```json
{
  "section": "billing",
  "message": "show my next premium"
}
```

### 4. 🏥 Find Provider in Network

```json
{
  "section": "network",
  "message": "find provider"
}
```

### 5. 🧑‍🤝‍🧑 Enroll a New Member

```json
{
  "section": "enrollment",
  "message": "enroll new member"
}
```

### 6. 🧘‍♀️ Wellness - Diet Plans

```json
{
  "section": "wellness",
  "message": "diet plan"
}
```

### 7. 🏃‍♂️ Wellness - Exercise Programs

```json
{
  "section": "wellness",
  "message": "exercise"
}
```

### 8. ❓ Unknown Section

```json
{
  "section": "unknown",
  "message": "what can you do"
}
```

---

## 📁 Project Structure

```
com.example.insurancechatbot
├── controller
│   └── ChatbotController.java
├── service
│   └── ChatbotService.java
├── enums
│   └── ActionType.java
├── dto
│   ├── ChatRequest.java
│   ├── ChatResponse.java
│   └── ActionButton.java
```

---
---

For demo purposes only — built by Jayanta Karmakar 🚀

