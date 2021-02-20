package br.com.leonardo.aprendizado.controllers;

import br.com.leonardo.aprendizado.entities.Pet;
import br.com.leonardo.aprendizado.repositories.PetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    private final PetRepository _petRepository;

    private PetController(PetRepository _petRepository) {
        this._petRepository = _petRepository;
    }

    @GetMapping
    public List<Pet> list() {
        return this._petRepository.findAll();
    }

    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        return this._petRepository.save(pet);
    }

}
