package com.greglixandrao.designpatternsspring.service;

import com.greglixandrao.designpatternsspring.model.Client;

import java.util.Optional;

public interface ClienteService {
    Iterable<Client> findAll();

    Optional<Client> findById(Long id);
    void insert(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
