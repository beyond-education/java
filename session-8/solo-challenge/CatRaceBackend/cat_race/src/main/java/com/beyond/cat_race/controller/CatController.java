package com.beyond.cat_race.controller;

import com.beyond.cat_race.data.Cat;
import com.beyond.cat_race.exceptions.NoCatsFoundException;
import com.beyond.cat_race.logic.CatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cats")
@CrossOrigin(allowedHeaders = "*")
public class CatController {

    private final CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping
    List<Cat> getAll() {
        return catService.getCats();
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.FOUND)
    Cat getCat(@PathVariable String name) throws NoCatsFoundException {
        return catService.getCat(name)
                .orElseThrow(NoCatsFoundException::new);
    }

    @PostMapping
    Cat addCat(@RequestBody Cat cat) {
        return catService.add(cat);
    }

    @DeleteMapping("{name}")
    boolean delete(@PathVariable String name) {
        return catService.deleteCat(name);
    }
}

