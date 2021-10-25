-- CRIA O BANCO DE DADOS
create database db_ecommerce;

-- USA O BANCO DE DADOS
use db_ecommerce;

-- CRIA UMA TABELA COM 5 PRODUTOS E UMA CHAVE PRIMÁRIA
create table tb_produtos(
id_produtos int auto_increment,
nome varchar(255),
preco double,
marca varchar(255),
estoque int,
primary key(id_produtos)
);

-- PREENCHER TABELA
insert into tb_produtos(nome, preco, marca, estoque) values
("HeadSet", 450.00, "corsair", 50),
("Mesa Gamer", 670.00, "Mobly", 34),
("Tv Led", 1200.00, "LG", 78),
("Iphone 11", 4000.00, "Apple", 120),
("LapTop", 6500.00, "lenovo", 4),
("Garrafa Termica", 95, "contigo", 45),
("Caneta", 45.00, "Emott", 120),
("Monitor", 1200.00, "LG", 34);

-- SELECIONA PRODUTOS COM VALOR MAIOR QUE 500
select * from tb_produtos where preco > 500;

-- SELECIONA PRODUTOS COM VALOR MENOR QUE 500
select * from tb_produtos where preco < 500;

-- ATUALIZA VALOR DE UM ITEM
update tb_produtos 
set estoque = 0
where id_produtos = 5;

select * from tb_produtos;







