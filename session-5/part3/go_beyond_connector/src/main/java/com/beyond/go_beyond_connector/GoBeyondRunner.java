package com.beyond.go_beyond_connector;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GoBeyondRunner implements ApplicationRunner {

    private final GoReturner goReturner;
    private final BeyondReturner beyondReturner;

    public GoBeyondRunner(GoReturner goReturner, BeyondReturner beyondReturner) {
        this.goReturner = goReturner;
        this.beyondReturner = beyondReturner;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(goReturner.getGo() + " " + beyondReturner.getBeyond());
    }
}
