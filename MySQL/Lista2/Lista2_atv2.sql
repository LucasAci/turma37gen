CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria (
id_categoria int auto_increment,
tamanho enum ("Pequena" , "Media", "Grande"),
tipo enum ("Salgada", "Doce"),
primary key (id_categoria)
);

create TABLE tb_pizza (
id_pizza int auto_increment,
sabor varchar(255) not null,
valor double not null,
borda enum ("sim","nao"),
fk_id_categoria int,
primary key (id_pizza),
foreign key (fk_id_categoria) references tb_categoria(id_categoria)
);

insert into tb_categoria (tamanho, tipo) values
("Pequena", "Salgada"),
("Média", "Salgada"),
("Grande", "Salgada"),
("Pequena","Doce"),
("Média","Doce"),
("Grande","Doce");

insert into tb_pizza (sabor, valor, borda, fk_id_categoria) values
("Mussarela", 40.00, "Não", 1),
("Calabresa", 45.90, "Sim", 2),
("Frango", 35.90, "sim", 3),
("Moda da Casa", 70.00, 4),
("Peperoni", 45.50, "Sim", 5),
("Cartola", 25.70, "Não", 6);

select * from tb_pizza where valor > 45;

select * from tb_pizza where valor between 20 and 60;

select * from tb_pizza where sabor like "c%";

-- Faça um um select com Inner join entre  tabela categoria e pizza.
select * from tb_categoria
	inner join tb_pizza
    on tb_pizza.fk_id_categoria = tb_categoria.id_categoria;
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).    
select * from tb_categoria
	inner join tb_pizza
    on tb_pizza.fk_id_categoria = tb_categoria.id_categoria 
    where tb_categoria.tipo = "Doce"




