INSERT INTO tb_beneficiario (id, nome, telefone, data_nascimento, data_inclusao, data_atualizacao)
VALUES
  ('f0d728e8-fced-4a58-8158-a364b71f2c49', 'João Silva', '123-456-7890', '1990-05-15', '2023-12-15', '2023-12-15'),
  ('6d4f05d0-77c0-4b1c-9654-932ecb3e8fe7', 'Maria Oliveira', '987-654-3210', '1985-08-20', '2023-12-15', '2023-12-15'),
  ('a1f3c76b-89ab-44ef-a121-1ce790c9a3a0', 'Carlos Santos', '555-123-4567', '1998-02-10', '2023-12-15', '2023-12-15');

INSERT INTO tb_documento (tipo_documento, descricao, data_inclusao, data_atualizacao, beneficiario_id)
VALUES
  ('RG', '1234567', '2023-12-15', '2023-12-15', 'f0d728e8-fced-4a58-8158-a364b71f2c49'),
  ('CPF', '98765432100', '2023-12-15', '2023-12-15', 'f0d728e8-fced-4a58-8158-a364b71f2c49'),
  ('Comprovante de Residência', 'Endereço fictício', '2023-12-15', '2023-12-15', 'f0d728e8-fced-4a58-8158-a364b71f2c49'),
  ('RG', '7654321', '2023-12-15', '2023-12-15', '6d4f05d0-77c0-4b1c-9654-932ecb3e8fe7'),
  ('CPF', '12345678901', '2023-12-15', '2023-12-15', '6d4f05d0-77c0-4b1c-9654-932ecb3e8fe7'),
  ('Comprovante de Residência', 'Outro endereço fictício', '2023-12-15', '2023-12-15', '6d4f05d0-77c0-4b1c-9654-932ecb3e8fe7'),
  ('RG', '9876543', '2023-12-15', '2023-12-15', 'a1f3c76b-89ab-44ef-a121-1ce790c9a3a0'),
  ('CPF', '11122233344', '2023-12-15', '2023-12-15', 'a1f3c76b-89ab-44ef-a121-1ce790c9a3a0'),
  ('Comprovante de Residencia', 'Mais um endereço fictício', '2023-12-15', '2023-12-15', 'a1f3c76b-89ab-44ef-a121-1ce790c9a3a0');