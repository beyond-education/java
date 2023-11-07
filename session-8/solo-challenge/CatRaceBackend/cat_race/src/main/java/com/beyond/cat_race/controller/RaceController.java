package com.beyond.cat_race.controller;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.exceptions.NoCatsFoundException;
import com.beyond.cat_race.logic.RaceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("race")
@CrossOrigin(allowedHeaders = "*")
public class RaceController {
    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    @GetMapping("start")
    Cat startRace() throws NoCatsFoundException {
        return raceService.evaluateWinningCat()
                .orElseThrow(NoCatsFoundException::new);
    }
}
