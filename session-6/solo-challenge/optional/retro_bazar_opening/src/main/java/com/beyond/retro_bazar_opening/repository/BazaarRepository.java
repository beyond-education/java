package com.beyond.retro_bazar_opening.repository;

import com.beyond.retro_bazar_opening.data.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BazaarRepository {
    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }
}
