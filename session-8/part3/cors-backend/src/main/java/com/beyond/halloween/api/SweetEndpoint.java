package com.beyond.halloween.api;

import com.beyond.halloween.data.Sweet;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("sweets")
@CrossOrigin
public class SweetEndpoint {
    private final List<Sweet> sweets = new ArrayList<>();

    @GetMapping
    List<Sweet> findAll() {
        return sweets;
    }

    @GetMapping("/{id}")
    Sweet findOne(@PathVariable String id) throws SweetNotFound {
        return sweets.stream()
                .filter(sweet -> sweet.getId().equals(id))
                .findFirst()
                .orElseThrow(SweetNotFound::new);
    }

    @PostMapping
    String save(@RequestBody Sweet sweet) {
        String id = UUID.randomUUID().toString();
        sweet.setId(id);
        sweets.add(sweet);
        return "Thank you!";
    }

    @DeleteMapping("/{id}")
    Sweet deleteOne(@PathVariable String id) throws SweetNotFound {
        Sweet sweet = findOne(id);
        sweets.remove(sweet);
        return sweet;
    }
}
