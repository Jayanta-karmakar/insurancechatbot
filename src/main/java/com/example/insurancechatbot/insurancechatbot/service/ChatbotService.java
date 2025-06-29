package com.example.insurancechatbot.insurancechatbot.service;

import com.example.insurancechatbot.insurancechatbot.dto.ActionButton;
import com.example.insurancechatbot.insurancechatbot.dto.ChatRequest;
import com.example.insurancechatbot.insurancechatbot.dto.ChatResponse;
import com.example.insurancechatbot.insurancechatbot.enums.ActionType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : jayantakarmakar
 * @mailto : jayantakarmakar998@mail.com
 * @created : 29/06/25, Sunday
 **/

@Slf4j
@Service
public class ChatbotService {

    public ChatResponse process(ChatRequest req) {
        String section = req.getSection().toLowerCase();
        String message = req.getMessage().toLowerCase();
        log.info("Processing request for section : {}, message: {}", section, message);

        switch (section) {
            case "policy":
                if (message.contains("apply")) {
                    return new ChatResponse(
                            "You can apply for a new insurance policy using the options below:",
                            List.of(
                                    new ActionButton(
                                            "Apply",
                                            ActionType.URL.name(),
                                            "https://insurance.gov/apply"),
                                    new ActionButton(
                                            "Eligibility",
                                            ActionType.URL.name(),
                                            "https://insurance.gov/eligibility"),
                                    new ActionButton(
                                            "Documents",
                                            ActionType.URL.name(),
                                            "https://insurance.gov/documents")
                            )
                    );
                } else {
                    return new ChatResponse(
                            "Ask me about applying for a policy or checking your coverage."
                    );
                }

            case "claims":
                if (message.contains("status")) {
                    return new ChatResponse(
                            "Your claim #INS-12345 is approved. Reimbursement will be credited in 3 days."
                    );
                } else {
                    return new ChatResponse(
                            "Ask about claim status, process, or required documents."
                    );
                }

            case "billing":
                return new ChatResponse("Your next premium is QAR 2,450 due on 2025-07-15.",
                        List.of(
                                new ActionButton(
                                        "Pay Now",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/pay"),
                                new ActionButton(
                                        "View History",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/billing-history")
                        ));

            case "network":
                return new ChatResponse("You can explore in-network hospitals and doctors using the options below:",
                        List.of(
                                new ActionButton(
                                        "Find Provider",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/providers"),
                                new ActionButton(
                                        "Download Network List",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/provider-list.pdf")
                        ));

            case "enrollment":
                return new ChatResponse("You can enroll a new member using the forms below:",
                        List.of(
                                new ActionButton(
                                        "Enroll",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/enroll"),
                                new ActionButton(
                                        "Eligibility",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/enroll/eligibility")
                        ));

            case "wellness":
                return new ChatResponse(
                        "Welcome to the Wellness Program. You can explore health plans and benefits:",
                        List.of(
                                new ActionButton(
                                        "Know More",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/wellness"),
                                new ActionButton(
                                        "Diet Plans",
                                        ActionType.URL.name(), "https://insurance.gov/wellness/diet"),
                                new ActionButton(
                                        "Exercise",
                                        ActionType.URL.name(),
                                        "https://insurance.gov/wellness/fitness")
                        ));

            default:
                return new ChatResponse(
                        "I didn't get that. Try asking about policies, claims, enrollment, or billing. " +
                                "or you want me to connect you to a human agent?");
        }
    }
}
