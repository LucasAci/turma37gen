CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id_categoria int auto_increment,
tamanho enum ("Pequena" , "Media", "Grande"),
tipo_massa enum ("Tradicional", "fina"),
primary key (id_categoria)
);

create TABLE tb_pizza (
id_pizza int auto_increment,
sabor varchar(255) not null,
borda enum ("Catupiry", "Chedar", "Sem borda"),
recheio boolean not null,
valor double not null,
fk_id_categoria int,
primary key (id_pizza),
foreign key (fk_id_categoria) references tb_categoria(id_cadegoria)
);

insert into tb_categoria (tamanho, tipo_massa) values
("Pequena", "Fina"),
("Média", "Tradicional"),
("Grande", "fina");

select * from tb_categoria;

insert into tb_pizza (sabor, borda, recheio, valor, fk_id_categoria) values
("Cababresa", "Catupiry", 1, 10.50, 1),
("Nordestina", "Cheddar", 0, 12.50, 2),
("Frango e Bacon", "Cheddar", 1, 12.50, 3),
("Perperoni", "Cheddar", 0, 12.50, 3),
("Cuz Cuz", "Catupiry", 1, 12.50, 2),
("Cartola" "Sem Borda", 0, 20.50, 1);






