package com.hexagonalddd.hexagonalarchtecture.model.repositories;

import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {
}
