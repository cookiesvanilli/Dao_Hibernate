package com.example.Dao.repository;

import com.example.Dao.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;


@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager manager;

    public List<Person> getPersonsByCity(String city) {
        return manager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
                .setParameter("city",city).getResultList();
    }
}