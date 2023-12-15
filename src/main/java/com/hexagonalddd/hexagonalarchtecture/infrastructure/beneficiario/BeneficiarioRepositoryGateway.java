package com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BeneficiarioRepositoryGateway {

    void insert(final BeneficiarioRequest request);
    void delete(final String id);
    void update(final String id, final BeneficiarioRequest request);
    Page<BeneficiarioResponse> findAll(Pageable pageable);
    BeneficiarioResponse findById(final String id);

}
