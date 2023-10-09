package com.beyond.go_beyond_connector;

import org.springframework.stereotype.Component;

@Component
public class BeyondReturner {
    private final String beyond = "Beyond";

    public String getBeyond() {
        return beyond;
    }
}
