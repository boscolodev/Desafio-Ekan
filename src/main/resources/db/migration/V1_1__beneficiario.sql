CREATE TABLE tb_beneficiario (
    id VARCHAR(255) NOT NULL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    telefone VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    data_inclusao DATE,
    data_atualizacao DATE
);