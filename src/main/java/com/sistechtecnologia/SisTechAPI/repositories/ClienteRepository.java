package com.sistechtecnologia.SisTechAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistechtecnologia.SisTechAPI.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
