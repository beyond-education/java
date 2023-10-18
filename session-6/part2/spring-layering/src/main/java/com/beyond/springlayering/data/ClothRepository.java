package com.beyond.springlayering.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClothRepository {
    private final List<String> clothes = new ArrayList<>();

    public List<String> getClothes() {
        return clothes;
    }
}
