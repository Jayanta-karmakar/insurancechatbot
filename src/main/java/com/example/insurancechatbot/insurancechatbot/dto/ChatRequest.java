package com.example.insurancechatbot.insurancechatbot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

@Builder
public class ChatRequest {
    private String section;
    private String message;

    public ChatRequest() {

    }

    public ChatRequest(String section, String message) {
        this.section = section;
        this.message = message;
    }

    public String getSection() {
        return section;
    }

    public String getMessage() {
        return message;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
