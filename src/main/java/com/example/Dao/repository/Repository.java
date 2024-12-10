package com.example.Dao.repository;

import com.example.Dao.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city")
                .setParameter("city",city).getResultList();
    }
}