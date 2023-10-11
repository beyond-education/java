package com.beyond.train_seat_ads.runner;

import com.beyond.train_seat_ads.logic.AdCreator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AdRunner implements ApplicationRunner {
    private final AdCreator adCreator;

    public AdRunner(AdCreator adCreator) {
        this.adCreator = adCreator;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(adCreator.getAd());
    }
}
