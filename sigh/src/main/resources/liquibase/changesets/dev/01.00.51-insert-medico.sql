--insert into core.cliente (name, idade) values ('Augusto', 30);
--insert into core.aluno (id, name, idade, sexo, matricula, cpf, profissao, nascimento, email, telefone, estcivil)
--values (1, 'Daniel', 22, 2, 1, '150.361.211-44', 'Estagiario', '09/07/1994', 'daniel.campanha@soulasalle.com.br',
--'3719-9181',2);

--insert into core.ator (id, nome, idade, sexo, cidade) values (1,'Daniel Barreto', '31', 2, 'São Gonçalo');

--insert into core.endereco(logradouro, numero, complemento, cep, bairro, cidade, estado) values 
--('Rua Zoraida Brasil Alcantara', 74, 'Apto 203', '24130-135', 'Fonseca', 'Niteroi', 'RJ');

--insert into core.curso (nome, listaDeClientes, valor, professor, inicio, termino, horario, descricao)
--values ('Curso de Canto Avançado', 1, 190.00, 'Getulio Nascimento', '22-12-2018', '30-09-2019', '14:00', 
--'Curso para alunos que tenham noção do canto e que não façam vergonha');

--insert into core.peca (listaDeAtores, detalhes, direcao, ano, inicio, termino, teatro, data, horario)
--values (1,'Antes que o Galo Cante', 'Ribamar Ribeiro', 2010, '09-10-2018', '31-12-2018', 'Teatro Joiville', '31-10-2018', '21:00');

--insert into core.workshop (nome, listaDeClientes, descricao, valor, professor, inicio, termino, horario)
--values 
--('Direção de Dublagem', 1, 'Vamos ensinar a falar direito na hora da dublagem', 90.00, 'Getulio Nascimento',
--'01-10-2018', '22-12-2018', '15:00') 

INSERT INTO medico(nome_med, email_med, crm, cpf_med, rg_med, data_nasci_med, sexo_med)
	   VALUES ('Thiago', 'thi_quaresma@hotmail.com', 1234578, 11111111111, 2222222222,'08-11-1986','M');