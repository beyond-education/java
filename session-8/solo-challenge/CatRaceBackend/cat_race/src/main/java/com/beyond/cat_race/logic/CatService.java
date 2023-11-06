package com.beyond.cat_race.logic;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.exceptions.NoCatsFoundException;
import com.beyond.cat_race.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatService {
    private final CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public void add(Cat cat) {
        catRepository.getCats().add(cat);
    }

    public List<Cat> getCats() {
        return catRepository.getCats();
    }

    public boolean deleteCat(String name) {
        return catRepository.getCats().removeIf(cat -> cat.name().equals(name));
    }

    public Cat getCat(String name) {
        return catRepository.getCats().stream()
                .filter(cat -> cat.name().equals(name))
                .findFirst().orElseThrow(()->new NoCatsFoundException());
    }
}
