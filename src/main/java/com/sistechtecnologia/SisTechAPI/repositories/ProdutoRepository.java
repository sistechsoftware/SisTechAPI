package com.sistechtecnologia.SisTechAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sistechtecnologia.SisTechAPI.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
