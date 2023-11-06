package com.beyond.cat_race.controller;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.logic.CatService;
import com.beyond.cat_race.logic.RaceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders = "*")
public class CatRaceController {

    private final CatService catService;
    private final RaceService raceService;

    public CatRaceController(CatService catService, RaceService raceService) {
        this.catService = catService;
        this.raceService = raceService;
    }

    @GetMapping("cats")
    List<Cat> getAll() {
        return catService.getCats();
    }

    @GetMapping("cat/{name}")
    @ResponseStatus(HttpStatus.FOUND)
    Cat getCat(@PathVariable String name) {
        return catService.getCat(name);
    }

    @GetMapping("start")
    Cat startRace() {
        return raceService.evaluateWinningCat();
    }

    @PostMapping("cat")
    Cat addCat(@RequestBody Cat cat) {
        catService.add(cat);
        return cat;
    }

    @DeleteMapping("cat/{name}")
    boolean delete(@PathVariable String name) {
        return catService.deleteCat(name);
    }
}
