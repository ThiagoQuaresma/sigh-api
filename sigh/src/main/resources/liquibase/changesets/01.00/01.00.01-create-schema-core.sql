--liquibase formatted sql
--changeset chopp:1.00.01 dbms:postgresql
--comment Criação do schema core e tabelas

CREATE schema teste;
ALTER SCHEMA core OWNER TO sigh;