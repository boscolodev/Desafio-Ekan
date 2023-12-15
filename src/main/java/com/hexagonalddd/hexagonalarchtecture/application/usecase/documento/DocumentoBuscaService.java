package com.hexagonalddd.hexagonalarchtecture.application.usecase.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;


import java.util.List;

public interface DocumentoBuscaService {
    List<DocumentoResponse> findByBeneficiarioId(final String id);

}
