package com.beyond.cat_race.logic;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RaceService {
    private final CatRepository catRepository;
    private final Random random;

    public RaceService(CatRepository catRepository, Random random) {
        this.catRepository = catRepository;
        this.random = random;
    }

    public Optional<Cat> evaluateWinningCat() {
        return catRepository.getCats().stream()
                .collect(Collectors.toMap(cat -> cat, cat -> cat.speed() * cat.agility() * random.nextInt(1, 11)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}
