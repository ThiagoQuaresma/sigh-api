CREATE SEQUENCE Historico_seq;

CREATE TABLE Historico (
  idHistorico BIGSERIAL NOT NULL,
  desc_historico VARCHAR(255) NULL,
  data_consulta DATE NULL,
  hora_consulta TIME(6) NULL,
  historico_nome_pac VARCHAR(255) NULL,
  PRIMARY KEY(idHistorico)
);

CREATE SEQUENCE Medico_seq;

CREATE TABLE Medico (
  idMedico BIGSERIAL NOT NULL,
  nome_med VARCHAR(255) NULL,
  email_med VARCHAR(255) NULL,
  crm BIGINT CHECK (crm > 0) NULL,
  cpf_med BIGINT CHECK (cpf_med > 0) NULL,
  rg_med BIGINT CHECK (rg_med > 0) NULL,
  data_nasci_med DATE NULL,
  sexo_med CHAR NULL,
  PRIMARY KEY(idMedico)
);

CREATE SEQUENCE Paciente_seq;

CREATE TABLE Paciente (
  idPaciente BIGSERIAL NOT NULL,
  nome_pac VARCHAR(255) NULL,
  telefone VARCHAR(20) NULL,
  data_nasc DATE NULL,
  plano BIGINT CHECK (plano > 0) NULL,
  nome_plano VARCHAR(255) NULL,
  cpf_pac BIGINT CHECK (cpf_pac > 0) NULL,
  rg_pac BIGINT CHECK (rg_pac > 0) NULL,
  email_pac VARCHAR(255) NULL,
  sexo_pac CHAR NULL,
  PRIMARY KEY(idPaciente)
);

CREATE SEQUENCE Uf_seq;

CREATE TABLE Uf (
  idUf BIGSERIAL NOT NULL,
  Paciente_idPaciente BIGINT CHECK (Paciente_idPaciente > 0) NULL,
  lograd_pac VARCHAR(255) NULL,
  num_logra_pac BIGINT CHECK (num_logra_pac > 0) NULL,
  compl_logra_pac VARCHAR(255) NULL,
  cep BIGINT CHECK (cep > 0) NULL,
  PRIMARY KEY(idUf, Paciente_idPaciente),
  FOREIGN KEY(Paciente_idPaciente)
    REFERENCES Paciente(idPaciente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE SEQUENCE Especialidade_seq;

CREATE TABLE Especialidade (
  idEspecialidade BIGSERIAL NOT NULL,
  Medico_idMedico BIGINT CHECK (Medico_idMedico > 0) NOT NULL,
  desc_especialidade VARCHAR(255) NULL,
  PRIMARY KEY(idEspecialidade, Medico_idMedico),
  FOREIGN KEY(Medico_idMedico)
    REFERENCES Medico(idMedico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE SEQUENCE UfMed_seq;

CREATE TABLE UfMed (
  idUfMed BIGSERIAL NOT NULL,
  Medico_idMedico BIGINT CHECK (Medico_idMedico > 0) NOT NULL,
  lograd_med VARCHAR(255) NULL,
  num_logra_med BIGINT CHECK (num_logra_med > 0) NULL,
  compl_logra_med VARCHAR(255) NULL,
  cep BIGINT CHECK (cep > 0) NULL,
  PRIMARY KEY(idUfMed, Medico_idMedico),
  FOREIGN KEY(Medico_idMedico)
    REFERENCES Medico(idMedico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE SEQUENCE Consulta_seq;

CREATE TABLE Consulta (
  idConsulta BIGSERIAL NOT NULL,
  Paciente_idPaciente BIGINT CHECK (Paciente_idPaciente > 0) NOT NULL,
  Medico_idMedico BIGINT CHECK (Medico_idMedico > 0) NOT NULL,
  consulta_nome_pac VARCHAR(255) NULL,
  consulta_nome_med VARCHAR(255) NULL,
  data_consulta DATE NULL,
  especialidade VARCHAR(255) NULL,
  hora VARCHAR(20) NULL,
  telefone VARCHAR(20) NULL,
  plano VARCHAR(255) NULL,
  PRIMARY KEY(idConsulta, Paciente_idPaciente, Medico_idMedico),
  FOREIGN KEY(Paciente_idPaciente)
    REFERENCES Paciente(idPaciente)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Medico_idMedico)
    REFERENCES Medico(idMedico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE SEQUENCE Atendimento_seq;

CREATE TABLE Atendimento (
  idAtendimento BIGSERIAL NOT NULL,
  Consulta_Medico_idMedico BIGINT CHECK (Consulta_Medico_idMedico > 0) NOT NULL,
  Consulta_Paciente_idPaciente BIGINT CHECK (Consulta_Paciente_idPaciente > 0) NOT NULL,
  Consulta_idConsulta BIGINT CHECK (Consulta_idConsulta > 0) NOT NULL,
  Historico_idHistorico BIGINT CHECK (Historico_idHistorico > 0) NOT NULL,
  usa_medicamento BOOL NULL,
  desc_medicamento VARCHAR(255) NULL,
  sintoma VARCHAR(255) NULL,
  alergico BOOL NULL,
  desc_alergico VARCHAR(255) NULL,
  doenca_hereditaria BOOL NULL,
  desc_doenca_hereditaria VARCHAR(255) NULL,
  info_extra VARCHAR(255) NULL,
  PRIMARY KEY(idAtendimento, Consulta_Medico_idMedico, Consulta_Paciente_idPaciente, Consulta_idConsulta, Historico_idHistorico),
  FOREIGN KEY(Consulta_idConsulta, Consulta_Paciente_idPaciente, Consulta_Medico_idMedico)
    REFERENCES Consulta(idConsulta, Paciente_idPaciente, Medico_idMedico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(Historico_idHistorico)
    REFERENCES Historico(idHistorico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE SEQUENCE Agenda_seq;

CREATE TABLE Agenda (
  idAgenda BIGSERIAL NOT NULL,
  Consulta_Paciente_idPaciente BIGINT CHECK (Consulta_Paciente_idPaciente > 0) NOT NULL,
  Consulta_idConsulta BIGINT CHECK (Consulta_idConsulta > 0) NOT NULL,
  Consulta_Medico_idMedico BIGINT CHECK (Consulta_Medico_idMedico > 0) NOT NULL,
  ano BIGINT CHECK (ano > 0) NULL,
  dia BIGINT CHECK (dia > 0) NULL,
  mes BIGINT CHECK (mes > 0) NULL,
  status_dia BIGINT CHECK (status_dia > 0) NULL,
  desc_status_dia VARCHAR(20) NULL,
  status_mes BIGINT CHECK (status_mes > 0) NULL,
  desc_status VARCHAR(20) NULL,
  PRIMARY KEY(idAgenda, Consulta_Paciente_idPaciente, Consulta_idConsulta, Consulta_Medico_idMedico),
  FOREIGN KEY(Consulta_idConsulta, Consulta_Paciente_idPaciente, Consulta_Medico_idMedico)
    REFERENCES Consulta(idConsulta, Paciente_idPaciente, Medico_idMedico)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
); 
