-- CRIA BANCO DE DADOS
create database db_escola;
-- USA BANCO DE DADOS
use db_escola;

-- CRIA UMA TABELA COM 5 ATRIBUTOS E UMA CHAVE PRIMÁRIA
create table tb_escola(
id_estudantes int not null auto_increment,
nome varchar(255),
matricula int,
disciplina varchar (255),
media double,
primary key(id_estudantes)
);

-- PREENCHER TABELA
insert into tb_escola(nome, matricula, disciplina, media)value
("Lucas", 001, "Matematica", 9.8),
("Camila", 002, "Matematica", 8.7),
("Adan", 003, "Matematica", 7.6),
("Joao", 004, "Portugues" , 5.7),
("fernanda", 005, "Historia", 3.5),
("Pedro", 006, "Geografia", 7.6),
("joaquim", 007, "matematica", 2.5),
("Aderbaldo", 008, "ciencias", 6.8);

-- delete from tb_escola where id_estudantes > 8;

select * from tb_escola where media > 7;
select * from tb_escola where media < 7;

update tb_escola set media = 5 where id_estudantes = 3;

select * from tb_escola;
