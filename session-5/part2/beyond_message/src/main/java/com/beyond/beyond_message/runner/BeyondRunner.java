package com.beyond.beyond_message.runner;

import com.beyond.beyond_message.logic.MessageContainer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class BeyondRunner implements ApplicationRunner {
    private final MessageContainer messageContainer;

    public BeyondRunner(MessageContainer messageContainer) {
        this.messageContainer = messageContainer;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageContainer.getMessage());
    }
}
