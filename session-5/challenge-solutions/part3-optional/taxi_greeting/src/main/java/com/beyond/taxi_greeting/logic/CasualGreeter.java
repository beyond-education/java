package com.beyond.taxi_greeting.logic;

import com.beyond.taxi_greeting.data.Passenger;
import org.springframework.stereotype.Component;

@Component
public class CasualGreeter {
    public String getCasualGreet(Passenger passenger) {
        return "Hi " + passenger.name();
    }
}
