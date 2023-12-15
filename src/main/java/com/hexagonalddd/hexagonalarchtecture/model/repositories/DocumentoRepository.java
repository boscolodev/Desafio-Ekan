package com.hexagonalddd.hexagonalarchtecture.model.repositories;

import com.hexagonalddd.hexagonalarchtecture.model.entities.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, Long> {

    @Query(nativeQuery = true, value =
            """
                    SELECT id, tipo_documento, descricao, data_inclusao, data_atualizacao
                    FROM tb_documento
                    WHERE beneficiario_id = :id
                    """)
    List<Documento> findDocumentosByBeneficiarioId(@Param("id") String id);



}
