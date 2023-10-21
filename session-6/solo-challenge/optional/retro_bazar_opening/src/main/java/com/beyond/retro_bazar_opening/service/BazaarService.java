package com.beyond.retro_bazar_opening.service;

import com.beyond.retro_bazar_opening.data.Item;
import com.beyond.retro_bazar_opening.repository.BazaarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

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
    public Item removeItem(String itemName) throws NoSuchElementException {
        List<Item> items = bazaarRepository.getItems();
        int indexOfElement = IntStream.range(0, items.size())
                .filter(index -> itemName.equals(items.get(index).name()))
                .findFirst().orElseThrow();
        return items.remove(indexOfElement);

    }
}
