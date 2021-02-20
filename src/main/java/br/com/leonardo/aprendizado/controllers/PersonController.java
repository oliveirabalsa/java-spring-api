package br.com.leonardo.aprendizado.controllers;

import br.com.leonardo.aprendizado.entities.Person;
import br.com.leonardo.aprendizado.repositories.PersonRepository;
import javassist.NotFoundException;
import org.apache.tomcat.jni.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/user")
public class PersonController {
    private final PersonRepository _personRepository;

    private PersonController(PersonRepository _personRepository) {
        this._personRepository = _personRepository;
    }

    @GetMapping
    public List<Person> list() {
        return this._personRepository.findAll();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return this._personRepository.save(person);
    }
    @PutMapping("/{id}")
    public Person update(@RequestBody Person person, @PathVariable("id") Long id) throws NotFoundException {
        Person personExists = this._personRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Cannot find this user"));

        personExists.setName(person.getName());
        return this._personRepository.save(personExists);
    }
}
