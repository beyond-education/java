package com.beyond.springseveralcomponents.runner;

import com.beyond.springseveralcomponents.logic.GoBeyond;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {
    private final GoBeyond goBeyond;

    public SpringRunner(GoBeyond goBeyond) {
        this.goBeyond = goBeyond;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(goBeyond.getMessage());
    }
}
