package com.beyond.taxi_greeting.logic;

import com.beyond.taxi_greeting.data.Passenger;
import org.springframework.stereotype.Component;

@Component
public class FormalGreeter {
    public String getFormalGreet(Passenger passenger) {
        return "Good Day " + passenger.name();
    }
}
