package com.example.Dao.service;

import com.example.Dao.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}