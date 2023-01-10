package org.sid.Animalservice.web;

import org.sid.Animalservice.entities.Animal;
import org.sid.Animalservice.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalsController {
    @Autowired
    AnimalRepository animalRepository;
    @GetMapping("/animals")
    public List<Animal> drivers(){return animalRepository.findAll();}
}
