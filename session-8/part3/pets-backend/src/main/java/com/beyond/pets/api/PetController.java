package com.beyond.pets.api;

import com.beyond.pets.data.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("pets")
@CrossOrigin
public class PetController {
    private final Set<Pet> pets = new HashSet<>();

    @GetMapping
    Set<Pet> getAll() {
        return pets;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    Pet getOne(@PathVariable String id) throws PetNotFound {
        return pets.stream()
                .filter(pet -> pet.getId().equals(id))
                .findFirst()
                .orElseThrow(PetNotFound::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Pet post(@RequestBody Pet pet) {
        String id = UUID.randomUUID().toString();
        pet.setId(id);
        pets.add(pet);
        return pet;
    }

    @PutMapping
    Pet put(@RequestBody Pet pet) throws PetNotFound {
        if (!pets.remove(pet)) {
            throw new PetNotFound();
        }
        pets.add(pet);
        return pet;
    }

    @DeleteMapping
    void deleteAll() {
        pets.clear();
    }

    @DeleteMapping("/{id}")
    void deleteOne(@PathVariable String id) {
        pets.removeIf(pet -> pet.getId().equals(id));
    }
}
