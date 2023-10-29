package com.djolean.liquibasedemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class Controller {
PersonRepository personRepository;
    public String createPerson(@RequestParam String name) {
        PersonRepository.save();
    }
}
