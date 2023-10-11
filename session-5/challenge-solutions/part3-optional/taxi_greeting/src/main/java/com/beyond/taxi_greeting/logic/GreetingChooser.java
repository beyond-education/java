package com.beyond.taxi_greeting.logic;

import com.beyond.taxi_greeting.data.Passenger;
import org.springframework.stereotype.Component;

@Component
public class GreetingChooser {
    private final CasualGreeter casualGreeter;
    private final FormalGreeter formalGreeter;

    public GreetingChooser(CasualGreeter casualGreeter, FormalGreeter formalGreeter) {
        this.casualGreeter = casualGreeter;
        this.formalGreeter = formalGreeter;
    }

    public String getGreet(Passenger passenger) {
        if(passenger.formalCommunication()) {
            return formalGreeter.getFormalGreet(passenger);
        }
        return casualGreeter.getCasualGreet(passenger);
    }
}
