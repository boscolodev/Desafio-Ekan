package com.hexagonalddd.hexagonalarchtecture.model.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_beneficiario")
public class Beneficiario {

    @Id
    private String id = UUID.randomUUID().toString();

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String telefone;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    private LocalDate dataInclusao;
    private LocalDate dataAtualizacao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "beneficiario_id") // Adicionando esta linha para indicar a chave estrangeira
    private Set<Documento> documentos = new HashSet<>();

}
