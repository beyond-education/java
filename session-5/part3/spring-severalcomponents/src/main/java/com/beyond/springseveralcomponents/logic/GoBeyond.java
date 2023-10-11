package com.beyond.springseveralcomponents.logic;

import org.springframework.stereotype.Component;

@Component
public class GoBeyond {
    private final Go go;
    private final Beyond beyond;

    public GoBeyond(Go go, Beyond beyond) {
        this.go = go;
        this.beyond = beyond;
    }

    public String getMessage() {
        String goMessage = go.getMessage();
        String beyondMessage = beyond.getMessage();
        return goMessage + " " + beyondMessage;
    }
}
