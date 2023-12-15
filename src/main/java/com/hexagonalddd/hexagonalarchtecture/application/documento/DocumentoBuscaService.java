package com.hexagonalddd.hexagonalarchtecture.application.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DocumentoBuscaService {

    Page<DocumentoResponse> findAllPaged(Pageable pageable);
    DocumentoResponse findById(final Long id);
    DocumentoResponse findByBeneficiarioId(final Long id);

}
