package com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BeneficiarioRepositoryGateway {

    void insert(final BeneficiarioRequest request);
    void delete(final Long id);
    void update(final Long id, final BeneficiarioRequest request);
    Page<BeneficiarioResponse> findAll(Pageable pageable);
    BeneficiarioResponse findById(final Long id);

}
