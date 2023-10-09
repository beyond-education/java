package com.beyond.get_str_another_class;

import org.springframework.stereotype.Component;

@Component
public class MessageContainer {
    final private String message = "Lets go beyond";

    public String getMessage() {
        return message;
    }
}
