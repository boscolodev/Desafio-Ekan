package com.hexagonalddd.hexagonalarchtecture.api.controller;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.application.usecase.documento.DocumentoBuscaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/documentos")
@RequiredArgsConstructor
public class DocumentoController {

    private final DocumentoBuscaServiceImpl buscaService;

    @GetMapping("/{id}")
    public List<DocumentoResponse> findAllByBeneficiarioId(@PathVariable final String id){
        return buscaService.findByBeneficiarioId(id);
    }

}
