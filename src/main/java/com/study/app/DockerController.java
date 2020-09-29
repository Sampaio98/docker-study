package com.study.app;

import com.study.app.model.Person;
import com.study.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DockerController {

    @Autowired
    private PersonRepository repository;

    @PostMapping
    public Person create(@RequestBody Person person) {
        return repository.save(person);
    }

    @GetMapping
    public List<Person> findAll() {
        return repository.findAll();
    }
}
