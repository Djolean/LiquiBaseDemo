package com.djolean.liquibasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller {

    private PersonRepository personRepository;
    @PostMapping
    public String createPerson(@RequestParam String name) {
        personRepository.save(new Person(name,"1.74"));
        return personRepository.findByName(name) + "Saved Successfully";
    }

    @GetMapping("person")
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }
}
