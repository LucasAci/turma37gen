-- CRIA O BANCO DE DADOS
create database db_rh;

-- USA BANCO DE DADOS
use db_rh;

-- CRIA UMA TABELA CDE FUNCIONÁRIOS, COM 5 ATRIBUTOS + UMA CHAVE PRIMÁRIA
create table tb_funcionarios(
	id_funcionarios int auto_increment,
    nome varchar(255),
    email varchar(255),
    cargo varchar(255),
    salario double null,
    primary key (id_funcionarios)
    );
    
insert into tb_funcionarios (nome, email, cargo, salario) value
("Lucas", "lucas@gmail.com", "Diretor Financeiro", 15000.00),
("Patricia", "patricia@gmail.com",  "supervisora", 5000.00),
("Camila" , "Camila@gmail.com", " Dev", 6000.00),
("Arthur", "Arthur@Gmail.com", "encarregado", 1000.00);

-- MOSTRA SALÁRIOS MAIORES QUE 2000
select * from tb_funcionarios where slario > 2000;

-- MOSTRA SALARIO MENORES QUE 2000
select * from tb_funcionarios where slario > 2000;

use db_rh;

update tb_funcionarios set salario =  10000.00 where id_funcionarios = 1;

select * from tb_funcionarios;
    
    
    
