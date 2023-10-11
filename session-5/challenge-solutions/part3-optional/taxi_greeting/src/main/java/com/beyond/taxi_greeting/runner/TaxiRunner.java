package com.beyond.taxi_greeting.runner;

import com.beyond.taxi_greeting.data.Passenger;
import com.beyond.taxi_greeting.logic.GreetingChooser;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TaxiRunner implements ApplicationRunner {
    private final GreetingChooser greetingChooser;

    public TaxiRunner(GreetingChooser greetingChooser) {
        this.greetingChooser = greetingChooser;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Passenger passenger = new Passenger("Batman", false);
        System.out.println(greetingChooser.getGreet(passenger));
    }
}
