package com.hexagonalddd.hexagonalarchtecture.model.repositories;

import com.hexagonalddd.hexagonalarchtecture.model.entities.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
}
