package com.hexagonalddd.hexagonalarchtecture.application.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.infrastructure.documento.DocumentoRepositoryGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentoBuscaServiceImpl implements DocumentoBuscaService {

    private final DocumentoRepositoryGatewayImpl repositoryGateway;

    @Override
    public Page<DocumentoResponse> findAllPaged(Pageable pageable) {
        return repositoryGateway.findAll(pageable);
    }

    @Override
    public DocumentoResponse findById(Long id) {
        return repositoryGateway.findById(id);
    }

    @Override
    public DocumentoResponse findByBeneficiarioId(Long id) {
        return repositoryGateway.findAllByBeneficiarioId(id);
    }
}
