package com.hexagonalddd.hexagonalarchtecture.api.controller;

import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioRequest;
import com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario.BeneficiarioResponse;
import com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario.BeneficiarioAtualizaService;
import com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario.BeneficiarioBuscaServiceImpl;
import com.hexagonalddd.hexagonalarchtecture.application.usecase.beneficiario.BeneficiarioCadastroServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/beneficiarios")
@RequiredArgsConstructor
public class BeneficiarioController {

    private final BeneficiarioCadastroServiceImpl cadastroService;
    private final BeneficiarioBuscaServiceImpl buscaService;
    private final BeneficiarioAtualizaService atualizaService;

    @PostMapping
    public void insert(@Valid @RequestBody final BeneficiarioRequest request) {
        cadastroService.insert(request);
    }

    @GetMapping
    public Page<BeneficiarioResponse> findAll(
            @PageableDefault(sort = "id", size = 10, page = 0, direction = Sort.Direction.ASC) Pageable pageable) {
        return buscaService.findAll(pageable);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable final String id, @Valid @RequestBody final BeneficiarioRequest request) {
        atualizaService.update(id, request);
    }


}
