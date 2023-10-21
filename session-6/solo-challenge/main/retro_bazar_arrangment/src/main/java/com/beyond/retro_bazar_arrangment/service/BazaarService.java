package com.beyond.retro_bazar_arrangment.service;

import com.beyond.retro_bazar_arrangment.data.Item;
import com.beyond.retro_bazar_arrangment.repository.BazaarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BazaarService {
    private final BazaarRepository bazaarRepository;

    public BazaarService(BazaarRepository bazaarRepository) {
        this.bazaarRepository = bazaarRepository;
    }

    public List<Item> getItems() {
        return bazaarRepository.getItems();
    }

    public void saveItem(String name, double price) {
        bazaarRepository.getItems().add(new Item(name, price));
    }
}
