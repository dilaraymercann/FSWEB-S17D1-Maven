package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();

    @GetMapping("/workintech/animal")
    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals.values());
    }

    @GetMapping("/workintech/animal/{id}")
    public Animal getAnimalById(@PathVariable int id) {
        return animals.get(id);
    }

    @PostMapping("/workintech/animal")
    public Animal addAnimal(@RequestBody Animal animal) {
        animals.put(animal.getId(), animal);
        return animal;
    }

    @PutMapping("/workintech/animal/{id}")
    public void updateAnimal(@PathVariable int id, @RequestBody Animal animal) {
        animals.put(id, animal);
    }

    @DeleteMapping("/workintech/animal/{id}")
    public void deleteAnimal(@PathVariable int id) {
        animals.remove(id);
    }
}
