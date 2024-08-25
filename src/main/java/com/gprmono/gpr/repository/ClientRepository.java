package com.gprmono.gpr.repository;

import com.gprmono.gpr.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
