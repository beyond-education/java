package com.beyond.go_beyond_connector;

import org.springframework.stereotype.Component;

@Component
public class GoReturner {
    private final String go = "Go";

    public String getGo() {
        return go;
    }
}
