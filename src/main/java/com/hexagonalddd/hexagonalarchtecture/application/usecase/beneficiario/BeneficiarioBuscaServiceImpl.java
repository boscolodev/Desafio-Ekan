package com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario.BeneficiarioRepositoryGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeneficiarioBuscaServiceImpl implements BeneficiarioBuscaService {

    private final BeneficiarioRepositoryGatewayImpl repositoryGateway;
    @Override
    public Page<BeneficiarioResponse> findAll(Pageable pageable) {
        return repositoryGateway.findAll(pageable);
    }

    @Override
    public BeneficiarioResponse findById(String id) {
        return repositoryGateway.findById(id);
    }
}
