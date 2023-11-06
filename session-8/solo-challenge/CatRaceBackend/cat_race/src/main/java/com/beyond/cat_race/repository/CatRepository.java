package com.beyond.cat_race.repository;

import com.beyond.cat_race.data.Cat;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CatRepository {
    private final List<Cat> cats = new ArrayList<>();

    public List<Cat> getCats() {
        return cats;
    }
}
