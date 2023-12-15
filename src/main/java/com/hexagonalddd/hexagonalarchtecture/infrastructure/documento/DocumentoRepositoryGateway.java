package com.hexagonalddd.hexagonalarchtecture.infrastructure.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface DocumentoRepositoryGateway {

    void save(final DocumentoRequest request);
    void delete(final Long id);
    void update(final Long id, final DocumentoRequest request);
    DocumentoResponse findById(final Long id);
    Page<DocumentoResponse> findAll(Pageable pageable);
    DocumentoResponse findAllByBeneficiarioId(final Long beneficiarioId);



}
