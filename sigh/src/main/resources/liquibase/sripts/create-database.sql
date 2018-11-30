CREATE DATABASE sigh;
ALTER DATABASE sigh OWNER TO postgres;

CREATE SEQUENCE Medico_seq;
CREATE TABLE Medico (
  idMedico BIGSERIAL NOT NULL ,
  nome_med VARCHAR(255) NULL,
  email_med VARCHAR(255) NULL,
  crm BIGINT CHECK (crm > 0) NULL,
  cpf_med BIGINT CHECK (cpf_med > 0) NULL,
  rg_med BIGINT CHECK (rg_med > 0) NULL,
  data_nasci_med DATE NULL,
  sexo_med CHAR NULL,
  PRIMARY KEY(idMedico)
);
