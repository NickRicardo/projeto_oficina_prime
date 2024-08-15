package com.oficinaprime.Oficina.Prime.repository;

import com.oficinaprime.Oficina.Prime.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
