package com.beyond.retro_bazar_opening.service.menu;

import com.beyond.retro_bazar_opening.data.Item;
import com.beyond.retro_bazar_opening.service.BazaarService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MenuChoicePrint implements MenuPoint{
    private final BazaarService bazaarService;

    public MenuChoicePrint(BazaarService bazaarService) {
        this.bazaarService = bazaarService;
    }

    @Override
    public void executeMenuChoice() {
        System.out.println("----------------------");
        bazaarService.getItems()
                .stream().collect(Collectors.groupingBy(item -> item, Collectors.counting()))
                .entrySet().stream()
                .map(entry ->
                        entry.getValue() == 1 ?
                                entry.getKey().toString()
                                : getCollectedOutputString(entry))
                .forEach(itemString-> System.out.println(itemString));
        System.out.println("----------------------");
    }

    @Override
    public String getMenuName() {
        return "Display Items";
    }

    private String getCollectedOutputString(Map.Entry<Item, Long> entry) {
        return entry.getKey().toString() + ", x" + entry.getValue();
    }
}
