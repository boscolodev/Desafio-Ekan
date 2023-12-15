package com.hexagonalddd.hexagonalarchtecture.application.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BeneficiarioBuscaService {

    Page<BeneficiarioResponse> findAll(Pageable pageable);
    BeneficiarioResponse findById(final Long id);


}
