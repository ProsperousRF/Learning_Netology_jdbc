package com.rakitov.netology.jdbc.service;

import com.rakitov.netology.jdbc.repository.Repository;

import java.util.List;

/**
 * @author Stanislav Rakitov
 */
@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}
