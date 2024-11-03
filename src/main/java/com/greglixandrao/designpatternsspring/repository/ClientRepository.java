package com.greglixandrao.designpatternsspring.repository;

import com.greglixandrao.designpatternsspring.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<Client, Long> {
}
