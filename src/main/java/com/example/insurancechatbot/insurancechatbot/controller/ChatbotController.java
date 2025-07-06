package com.example.insurancechatbot.insurancechatbot.controller;

import com.example.insurancechatbot.insurancechatbot.dto.ChatRequest;
import com.example.insurancechatbot.insurancechatbot.dto.ChatResponse;
import com.example.insurancechatbot.insurancechatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest req) {
        return chatbotService.process(req);
    }
}
