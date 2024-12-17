package com.example.Dao.controller;

import com.example.Dao.entity.Person;
import com.example.Dao.repository.Repository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
public class Controller {
    private final Repository repository;

    @GetMapping("/persons/by-city")
    protected List<Person> getPersonsByCity(@RequestParam (value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }
}