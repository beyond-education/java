package com.beyond.awesomebirthdays.runner;

import com.beyond.awesomebirthdays.logic.BirthdayMessageGenerator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {
    private final BirthdayMessageGenerator birthdayMessageGenerator;

    public SpringRunner(BirthdayMessageGenerator birthdayMessageGenerator) {
        this.birthdayMessageGenerator = birthdayMessageGenerator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        int day = 12;
        System.out.println(birthdayMessageGenerator.generateBirthdayMessage(day));
    }
}
