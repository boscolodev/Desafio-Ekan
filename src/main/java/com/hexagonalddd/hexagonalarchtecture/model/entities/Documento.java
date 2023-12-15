package com.hexagonalddd.hexagonalarchtecture.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_documento")
public class Documento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tipoDocumento;
    @Column(nullable = false)
    private String descricao;
    private LocalDate dataInclusao;
    private LocalDate dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id", nullable = false)
    private Beneficiario beneficiario;

    @PrePersist
    public void prePersistDataInclusao() {
        this.dataInclusao = LocalDate.now();
    }

    @PreUpdate
    public void preUpdateDataAtualizacao() {
        this.dataAtualizacao = LocalDate.now();
    }


}
