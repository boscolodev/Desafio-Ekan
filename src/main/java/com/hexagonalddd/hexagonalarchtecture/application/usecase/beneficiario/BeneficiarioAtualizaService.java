package com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;

public interface BeneficiarioAtualizaService {

    void update(final String id, final BeneficiarioRequest request);

}
