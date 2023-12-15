package com.hexagonalddd.hexagonalarchtecture.api.dto.documento;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class DocumentoRequest implements Serializable {
    private static final String CAMPO_OBRIGATORIO = "Campo Obrigatório";

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
