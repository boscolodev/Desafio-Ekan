package com.hexagonalddd.hexagonalarchtecture.api.controller;

import com.hexagonalddd.hexagonalarchtecture.api.dto.documento.DocumentoResponse;
import com.hexagonalddd.hexagonalarchtecture.application.documento.DocumentoBuscaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/documentos")
@RequiredArgsConstructor
public class DocumentoController {

    private final DocumentoBuscaServiceImpl buscaService;

    @GetMapping("/{id}")
    public DocumentoResponse findAllByBeneficiarioId(@PathVariable final Long id){

        return buscaService.findByBeneficiarioId(id);
    }

    @GetMapping("/doc/{id}")
    public DocumentoResponse findDocumentoById(@PathVariable final Long id){
        return buscaService.findById(id);
    }

    @GetMapping
    public Page<DocumentoResponse> findAllPaged(Pageable pageable){
        return buscaService.findAllPaged(pageable);
    }



}
