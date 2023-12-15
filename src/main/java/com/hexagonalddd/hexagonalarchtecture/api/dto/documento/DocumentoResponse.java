package com.hexagonalddd.hexagonalarchtecture.api.dto.documento;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class DocumentoResponse implements Serializable {

    private static final String CAMPO_OBRIGATORIO = "Campo Obrigatório";

    @NotNull(message = CAMPO_OBRIGATORIO )
    private Long id;

    @NotEmpty(message = CAMPO_OBRIGATORIO )
    private String tipoDocumento;

    @NotEmpty(message = CAMPO_OBRIGATORIO )
    private String descricao;

    private LocalDate dataInclusao;
    private LocalDate dataAtualizacao;

}
