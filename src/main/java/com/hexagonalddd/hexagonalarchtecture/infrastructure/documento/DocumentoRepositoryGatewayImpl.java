package com.hexagonalddd.hexagonalarchtecture.infrastructure.documento;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import com.hexagonalddd.hexagonalarchtecture.model.repositories.DocumentoRepository;
import com.hexagonalddd.hexagonalarchtecture.shared.Mapper;
import com.hexagonalddd.hexagonalarchtecture.shared.exceptions.DatabaseNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DocumentoRepositoryGatewayImpl implements DocumentoRepositoryGateway {

    private final DocumentoRepository repository;

    @Override
    public void save(DocumentoRequest request) {
        repository.save(Mapper.converte(request, Documento.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, DocumentoRequest request) {
        DocumentoResponse entity = findById(id);
        Mapper.copyEntity(request,entity);
        repository.save(Mapper.converte(entity, Documento.class));
    }

    @Override
    public DocumentoResponse findById(Long id) {
        return Mapper.converte(
                repository.findById(id).orElseThrow(() -> new DatabaseNotFoundException("Registro não encontrado"))
                ,DocumentoResponse.class);
    }

    @Override
    public Page<DocumentoResponse> findAll(Pageable pageable) {
        List<DocumentoResponse> documentoResponses = repository.findAll(pageable)
                .stream()
                .map(response -> Mapper.converte(response, DocumentoResponse.class))
                .collect(Collectors.toList());

        return new PageImpl<>(documentoResponses, pageable, documentoResponses.size());
    }

    @Override
    public DocumentoResponse findAllByBeneficiarioId(Long beneficiarioId) {
        return null;
    }
}
