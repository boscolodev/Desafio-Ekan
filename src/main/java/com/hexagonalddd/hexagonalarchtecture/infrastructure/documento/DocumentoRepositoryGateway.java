package com.hexagonalddd.hexagonalarchtecture.infrastructure.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;


import java.util.List;


public interface DocumentoRepositoryGateway {
    List<DocumentoResponse> findAllByBeneficiarioId(final String beneficiarioId);

}
