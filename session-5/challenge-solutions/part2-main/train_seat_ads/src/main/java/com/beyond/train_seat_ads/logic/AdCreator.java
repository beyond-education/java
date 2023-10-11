package com.beyond.train_seat_ads.logic;

import org.springframework.stereotype.Component;

@Component
public class AdCreator {
    private final String ad = "IT-Trainings for experts";

    public String getAd() {
        return ad;
    }
}
