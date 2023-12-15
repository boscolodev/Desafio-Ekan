package com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario.BeneficiarioRepositoryGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeneficiarioAtualizaServiceImpl implements BeneficiarioAtualizaService {

    private final BeneficiarioRepositoryGatewayImpl repositoryGateway;

    @Override
    public void update(String id, BeneficiarioRequest request) {
        repositoryGateway.update(id, request);
    }
}
