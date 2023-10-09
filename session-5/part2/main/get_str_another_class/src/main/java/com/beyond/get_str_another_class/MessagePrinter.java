package com.beyond.get_str_another_class;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter implements ApplicationRunner {

    private final MessageContainer messageContainer;

    public MessagePrinter(MessageContainer messageContainer) {
        this.messageContainer = messageContainer;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("messageContainer = " + messageContainer.getMessage());
    }
}
