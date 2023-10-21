package com.beyond.retro_bazar_arrangment.repository;

import com.beyond.retro_bazar_arrangment.data.Item;
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
