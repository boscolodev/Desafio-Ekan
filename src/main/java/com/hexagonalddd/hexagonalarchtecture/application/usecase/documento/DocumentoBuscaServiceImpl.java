package com.hexagonalddd.hexagonalarchtecture.application.usecase.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.infrastructure.documento.DocumentoRepositoryGatewayImpl;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentoBuscaServiceImpl implements DocumentoBuscaService {

    private final DocumentoRepositoryGatewayImpl repositoryGateway;

    @Override
    public List<DocumentoResponse> findByBeneficiarioId(String id) {
        return repositoryGateway.findAllByBeneficiarioId(id);
    }
}
