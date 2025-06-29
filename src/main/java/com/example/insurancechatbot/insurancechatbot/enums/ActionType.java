package com.example.insurancechatbot.insurancechatbot.enums;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

public enum ActionType {
    URL("URL"),
    INTERNAL("INTERNAL");

    private final String type;

    ActionType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
