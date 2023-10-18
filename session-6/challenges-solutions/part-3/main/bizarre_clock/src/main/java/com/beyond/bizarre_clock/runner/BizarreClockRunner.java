package com.beyond.bizarre_clock.runner;

import com.beyond.bizarre_clock.logic.TimeLapseService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BizarreClockRunner implements ApplicationRunner {
    private final TimeLapseService timeLapseService;

    public BizarreClockRunner(TimeLapseService timeLapseService) {
        this.timeLapseService = timeLapseService;
    }

    @Override
    public void run(ApplicationArguments args) {
        for (int i = 0; i < 24; i++) {
            timeLapseService.increaseTimer();
        }
    }
}
