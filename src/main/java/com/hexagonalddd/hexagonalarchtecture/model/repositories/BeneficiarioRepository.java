package com.hexagonalddd.hexagonalarchtecture.model.repositories;

import com.hexagonalddd.hexagonalarchtecture.model.entities.Beneficiario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, String> {

    @Override
    @EntityGraph(attributePaths = "documentos")
    Page<Beneficiario> findAll(Pageable pageable);

}
