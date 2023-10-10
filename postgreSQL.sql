-- -----------------------------------------------------
-- Tabela `aluno`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS aluno (
  id SERIAL,
  nome VARCHAR(45) NOT NULL,
  sexo VARCHAR(45) NULL,
  cpf VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  telefone INT NULL,
  PRIMARY KEY (ID))
;