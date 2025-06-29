package com.example.insurancechatbot.insurancechatbot.dto;

import lombok.Builder;

import java.util.List;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

@Builder
public class ChatResponse {
    private String reply;
    private List<ActionButton> actions;

    public ChatResponse(String reply, List<ActionButton> actions) {
        this.reply = reply;
        this.actions = actions;
    }

    public ChatResponse(String reply) {
        this.reply = reply;
        this.actions = List.of();
    }

    public String getReply() {
        return reply;
    }

    public List<ActionButton> getActions() {
        return actions;
    }
}
