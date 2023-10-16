package com.beyond.bizarre_clock.runner;

import com.beyond.bizarre_clock.logic.TimeLapseService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class BizarreClockRunner implements ApplicationRunner {

    private final TimeLapseService timeLapseService;
    private final Scanner scanner;

    public BizarreClockRunner(TimeLapseService timeLapseService, Scanner scanner) {
        this.timeLapseService = timeLapseService;
        this.scanner = scanner;
    }

    @Override
    public void run(ApplicationArguments args) {
        while(!scanner.nextLine().equalsIgnoreCase("over")) {
            timeLapseService.increaseTimer();
        }
    }
}
