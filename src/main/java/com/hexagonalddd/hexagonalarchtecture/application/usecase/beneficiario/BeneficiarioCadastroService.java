package com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;

public interface BeneficiarioCadastroService {
    void insert(final BeneficiarioRequest request);

}
