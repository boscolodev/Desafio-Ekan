package com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.infrastructure.beneficiario.BeneficiarioRepositoryGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BeneficiarioCadastroServiceImpl implements BeneficiarioCadastroService {

    private final BeneficiarioRepositoryGatewayImpl repositoryGateway;
    @Override
    public void insert(BeneficiarioRequest request) {
        repositoryGateway.insert(request);
    }
}
