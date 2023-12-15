package com.hexagonalddd.hexagonalarchtecture.api.dto.beneficiario;


import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class BeneficiarioRequest implements Serializable {

    private static final String CAMPO_OBRIGATORIO = "Campo Obrigatório";

    @NotEmpty(message = CAMPO_OBRIGATORIO)
    private String nome;
    @NotEmpty(message = CAMPO_OBRIGATORIO)
    private String telefone;
    @NotNull(message = CAMPO_OBRIGATORIO )
    private LocalDate dataNascimento;

    private LocalDate dataInclusao;
    private LocalDate dataAtualizacao;

    private Set<Documento> documentos = new HashSet<>();

}
