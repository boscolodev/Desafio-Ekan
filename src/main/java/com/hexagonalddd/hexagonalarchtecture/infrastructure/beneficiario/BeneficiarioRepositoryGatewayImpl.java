package com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.model.entities.Beneficiario;
import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import com.hexagonalddd.hexagonalarchtecture.model.repositories.BeneficiarioRepository;
import com.hexagonalddd.hexagonalarchtecture.shared.Mapper;
import com.hexagonalddd.hexagonalarchtecture.shared.exceptions.DatabaseNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class BeneficiarioRepositoryGatewayImpl implements BeneficiarioRepositoryGateway {

    private final BeneficiarioRepository repository;

    @Override
    public void insert(BeneficiarioRequest request) {

        Beneficiario beneficiario = new Beneficiario();
        Mapper.copyEntity(request, beneficiario);
        beneficiario.getDocumentos().forEach(documento -> documento.setDataInclusao(LocalDate.now()));
        beneficiario.setDataInclusao(LocalDate.now());
        repository.save(beneficiario);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public void update(String id, BeneficiarioRequest request) {

        BeneficiarioResponse responseById = findById(id);
        Mapper.copyEntity(request, responseById);
        responseById.getDocumentos().forEach(documento -> documento.setDataAtualizacao(LocalDate.now()));
        responseById.setDataAtualizacao(LocalDate.now());

        repository.save(Mapper.converte(responseById, Beneficiario.class));
    }

    @Override
    public Page<BeneficiarioResponse> findAll(Pageable pageable) {
        Page<Beneficiario> beneficiarios = repository.findAll(pageable);

        List<BeneficiarioResponse> responseList = beneficiarios.getContent()
                .stream()
                .map(beneficiario -> {
                    Set<DocumentoResponse> documentosResponse = beneficiario.getDocumentos()
                            .stream()
                            .map(documento -> Mapper.converte(documento, DocumentoResponse.class))
                            .collect(Collectors.toSet());

                    // Converter documentosResponse de DocumentoResponse para Documento
                    Set<Documento> documentos = documentosResponse.stream()
                            .map(documentoResponse -> Mapper.converte(documentoResponse, Documento.class))
                            .collect(Collectors.toSet());

                    BeneficiarioResponse beneficiarioResponse = Mapper.converte(beneficiario, BeneficiarioResponse.class);
                    beneficiarioResponse.setDocumentos(documentos);

                    return beneficiarioResponse;
                })
                .toList();

        return new PageImpl<>(responseList, pageable, beneficiarios.getTotalElements());
    }

    @Override
    public BeneficiarioResponse findById(final String id) {
        return Mapper.converte(repository.findById(id).orElseThrow(() -> new DatabaseNotFoundException("Registro não encontrado")), BeneficiarioResponse.class);
    }
}
