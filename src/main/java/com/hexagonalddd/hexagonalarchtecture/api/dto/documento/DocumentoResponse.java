package com.hexagonalddd.hexagonalarchtecture.api.dto.documento;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.persistence.Column;
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

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataInclusao;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataAtualizacao;

}
