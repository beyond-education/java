package com.beyond.beyond_message.logic;

import org.springframework.stereotype.Component;

@Component
public class MessageContainer {
    private final String message = "Go Beyond";

    public String getMessage() {
        return message;
    }
}
