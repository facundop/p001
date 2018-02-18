package com.facundoprecentado.repository;

import com.facundoprecentado.domain.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
