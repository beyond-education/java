package com.beyond.retro_bazar_opening.configuration;


import com.beyond.retro_bazar_opening.service.BazaarService;
import com.beyond.retro_bazar_opening.service.UserInput;
import com.beyond.retro_bazar_opening.service.menu.MenuChoiceAdd;
import com.beyond.retro_bazar_opening.service.menu.MenuChoicePrint;
import com.beyond.retro_bazar_opening.service.menu.MenuChoiceSell;
import com.beyond.retro_bazar_opening.service.menu.MenuPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfiguration {
    private final BazaarService bazaarService;
    private final UserInput userInput;

    public MenuConfiguration(BazaarService bazaarService, UserInput userInput) {
        this.bazaarService = bazaarService;
        this.userInput = userInput;
    }

    @Bean
    List<MenuPoint> menuPoints() {
        return List.of(new MenuChoicePrint(bazaarService),
                new MenuChoiceAdd(userInput, bazaarService),
                new MenuChoiceSell(userInput, bazaarService));
    }
}
