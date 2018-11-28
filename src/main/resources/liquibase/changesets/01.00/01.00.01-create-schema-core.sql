--liquibase formatted sql
--changeset chopp:1.00.01 dbms:postgresql
--comment Criação do schema core e tabelas

--schema
CREATE SCHEMA core;
ALTER SCHEMA core OWNER TO sisgac;

create table core.endereco
( id bigserial NOT NULL,
logradouro varchar(100) NOT NULL,
numero integer,
complemento varchar(100),
cep varchar(20) NOT NULL,
bairro varchar(100) NOT NULL,
cidade varchar(100) NOT NULL,
estado varchar(100) NOT NULL,
CONSTRAINT pk_endereco PRIMARY KEY (id)
);


create table core.aluno
( id bigserial NOT NULL,
  id_endereco bigint,
  name varchar(100) NOT NULL,
  idade integer NOT NULL,
  sexo integer NOT NULL,
  cpf varchar(20) NOT NULL,
  profissao varchar(100) NOT NULL,
  nascimento date NOT NULL,
  email varchar(60) NOT NULL,
  telefone varchar(20) NOT NULL,
  estcivil integer NOT NULL,
  CONSTRAINT pk_aluno PRIMARY KEY (id),
  CONSTRAINT fk_aluno FOREIGN KEY (id_endereco)
        REFERENCES core.endereco (id) MATCH SIMPLE
		ON UPDATE NO ACTION ON DELETE NO ACTION
);


create table core.mentor
( id bigserial NOT NULL,
  nome varchar(100) NOT NULL,
  idade integer NOT NULL,
  sexo integer NOT NULL,
  id_endereco bigint,
  funcao varchar(50) NOT NULL,
  CONSTRAINT pk_mentor PRIMARY KEY (id),
  CONSTRAINT fk_mentor FOREIGN KEY (id_endereco)
        	REFERENCES core.endereco (id) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION
);
	

create table core.atividade
(id bigserial NOT NULL,
nome varchar(100) NOT NULL,
valor integer NOT NULL,
tipo varchar(100) NOT NULL,
inicio date NOT NULL,
termino date NOT NULL,	
descricao varchar(500),
CONSTRAINT pk_atividade PRIMARY KEY (id)
);


create table core.turma
(cod bigserial NOT NULL,
horaInicio time NOT NULL,
horaFim time NOT NULL,
diaSemana varchar(500),
id_mentor bigint NOT NULL,
id_atividade bigint NOT NULL,
CONSTRAINT pk_turma PRIMARY KEY (cod),
CONSTRAINT fk_1_turma FOREIGN KEY(id_mentor)
REFERENCES core.mentor(id) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION,
CONSTRAINT fk_2_turma FOREIGN KEY(id_atividade)
	REFERENCES core.atividade(id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION
);
	
create table core.matricula
(id bigserial NOT NULL,    
    cod_turma bigint NOT NULL,
    id_aluno bigint NOT NULL,
    data date NOT NULL,
    CONSTRAINT pk_matricula PRIMARY KEY (id),
    CONSTRAINT fk_1_matricula FOREIGN KEY (cod_turma)
    	REFERENCES core.turma (cod) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION,
    CONSTRAINT fk_2_maricula FOREIGN KEY (id_aluno)
        	REFERENCES core.aluno (id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION
);

create table core.mensalidade
(id bigserial NOT NULL,
    id_mat bigserial NOT NULL,
    valorPago bigint NOT NULL,
    mesRef integer NOT NULL,
    anoRef integer NOT NULL,
    mesPag integer NOT NULL,
    anoPag integer NOT NULL,
    data date NOT NULL,
    horario time NOT NULL,
    CONSTRAINT pk_mensalidade PRIMARY KEY (id),
    CONSTRAINT fk_mensalidade FOREIGN KEY (id_mat)
        	REFERENCES core.matricula (id) MATCH SIMPLE
ON UPDATE NO ACTION ON DELETE NO ACTION
);


	
create table core.frequencia
(id bigserial NOT NULL,
id_mat bigserial NOT NULL,
frequencia integer NOT NULL,
CONSTRAINT pk_frequencia PRIMARY KEY (id),
CONSTRAINT fk_frequencia FOREIGN KEY (id_mat)
REFERENCES core.matricula (id) MATCH SIMPLE
	ON UPDATE NO ACTION ON DELETE NO ACTION
);

