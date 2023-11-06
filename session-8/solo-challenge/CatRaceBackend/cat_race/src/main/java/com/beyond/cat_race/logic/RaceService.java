package com.beyond.cat_race.logic;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.exceptions.NoCatsFoundException;
import com.beyond.cat_race.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class RaceService {
    private final CatRepository catRepository;
    private final Random random;

    public RaceService(CatRepository catRepository, Random random) {
        this.catRepository = catRepository;
        this.random = random;
    }

    public Cat evaluateWinningCat() {
        return catRepository.getCats().stream()
                .collect(Collectors.toMap(cat -> cat, cat -> cat.speed() * cat.agility() * random.nextInt(1, 11)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(()->new NoCatsFoundException())
                .getKey();
    }
}
