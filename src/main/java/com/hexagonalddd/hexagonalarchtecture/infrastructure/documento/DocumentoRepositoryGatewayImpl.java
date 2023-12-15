package com.hexagonalddd.hexagonalarchtecture.infrastructure.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import com.hexagonalddd.hexagonalarchtecture.model.repositories.DocumentoRepository;
import com.hexagonalddd.hexagonalarchtecture.shared.Mapper;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentoRepositoryGatewayImpl implements DocumentoRepositoryGateway {

    private final DocumentoRepository repository;
    @Override
    public List<DocumentoResponse> findAllByBeneficiarioId(String beneficiarioId) {
        List<Documento> documentosByBeneficiarioId = repository.findDocumentosByBeneficiarioId(beneficiarioId);

        return documentosByBeneficiarioId.stream()
                .map(documento -> Mapper.converte(documento, DocumentoResponse.class))
                .toList();
    }
}
