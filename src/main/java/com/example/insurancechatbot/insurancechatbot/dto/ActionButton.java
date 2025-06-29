package com.example.insurancechatbot.insurancechatbot.dto;

import lombok.Builder;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

@Builder
public class ActionButton {
    private String label;
    private String actionType; // URL or INTERNAL
    private String actionValue;

    public ActionButton(String label, String actionType, String actionValue) {
        this.label = label;
        this.actionType = actionType;
        this.actionValue = actionValue;
    }

    public String getLabel() {
        return label;
    }

    public String getActionType() {
        return actionType;
    }

    public String getActionValue() {
        return actionValue;
    }
}
