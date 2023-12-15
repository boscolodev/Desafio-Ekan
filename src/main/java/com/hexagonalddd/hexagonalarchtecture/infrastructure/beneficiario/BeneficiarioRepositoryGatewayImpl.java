package com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import com.hexagonalddd.hexagonalarchtecture.model.entities.Beneficiario;
import com.hexagonalddd.hexagonalarchtecture.model.repositories.BeneficiarioRepository;
import com.hexagonalddd.hexagonalarchtecture.shared.Mapper;
import com.hexagonalddd.hexagonalarchtecture.shared.exceptions.DatabaseNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeneficiarioRepositoryGatewayImpl implements BeneficiarioRepositoryGateway {

    private final BeneficiarioRepository repository;

    @Override
    public void insert(BeneficiarioRequest request) {
        repository.save(Mapper.converte(request, Beneficiario.class));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Long id, BeneficiarioRequest request) {
        BeneficiarioResponse responseById = findById(id);
        Beneficiario beneficiario = new Beneficiario();
        Mapper.copyEntity(request, beneficiario);
        repository.save(beneficiario);
    }

    @Override
    public Page<BeneficiarioResponse> findAll(Pageable pageable) {
        return (Page<BeneficiarioResponse>) repository.findAll(pageable).stream()
                .map(element -> Mapper.converte(element, BeneficiarioResponse.class)).toList();
    }

    @Override
    public BeneficiarioResponse findById(final Long id) {
        return Mapper.converte(repository.findById(id).orElseThrow(() -> new DatabaseNotFoundException("Registro não encontrado")), BeneficiarioResponse.class);
    }
}
