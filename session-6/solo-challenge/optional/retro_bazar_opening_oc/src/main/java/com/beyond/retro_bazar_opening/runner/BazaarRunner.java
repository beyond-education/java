package com.beyond.retro_bazar_opening.runner;

import com.beyond.retro_bazar_opening.service.RetroUiService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BazaarRunner implements ApplicationRunner {
    private final RetroUiService retroUiService;

    public BazaarRunner(RetroUiService retroUiService) {
        this.retroUiService = retroUiService;
    }

    @Override
    public void run(ApplicationArguments args) {
        retroUiService.showMenu();
    }
}
