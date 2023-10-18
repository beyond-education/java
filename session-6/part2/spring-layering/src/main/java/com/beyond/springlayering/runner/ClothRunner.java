package com.beyond.springlayering.runner;

import com.beyond.springlayering.data.ClothRepository;
import com.beyond.springlayering.logic.ClothService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClothRunner implements ApplicationRunner {
    private final ClothService clothService;
    public ClothRunner(ClothRepository clothRepository, ClothService clothService) {
        this.clothService = clothService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {


        String cloth = clothService.getCloth();
        System.out.println("cloth = " + cloth);

    }
}
