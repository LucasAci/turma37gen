CREATE DATABASE db_pizzaria_legal ;

USE db_pizzaria_legal ;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT, 
    tamanho ENUM('Pequena', 'Média', 'Grande'),
    tipo ENUM('Salgada', 'Doce'),
    PRIMARY KEY (id_categoria)
);
CREATE TABLE tb_pizza (
	id_pizza INT AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda ENUM('Catupiry', 'Cheddar', 'Sem Borda'),
    recheio BOOLEAN NOT NULL, 
    valor  DOUBLE NOT NULL,
    fk_id_categoria INT,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_id_categoria) REFERENCES tb_categoria(id_categoria)
);
INSERT INTO tb_categoria (tamanho, tipo) VALUES
("Pequena", "Salgada"),
("Média", "Doce"),
("Grande", "Salgada");

SELECT * FROM tb_categoria ;
INSERT INTO tb_pizza (sabor, borda, recheio, valor, fk_id_categoria) VALUES
("Calabresa", "Catupiry", 1, 10.50, 1),
("Nordestina","Cheddar", 0, 65.00, 2),
("Frango e Bacon","Cheddar", 1, 12.50, 3),
("Peperoni","Catupiry", 0, 45.50, 3),
("Cuz cuz", "Cheddar", 1, 12.50, 2),
("Cartola", "Sem Borda", 0, 20.50, 1);
SELECT * FROM tb_pizza ;

SELECT * FROM tb_pizza WHERE valor > 45.00 ;

SELECT * FROM tb_pizza WHERE valor > 29.00 AND valor < 60.00 ;

SELECT * FROM tb_pizza WHERE sabor LIKE 'c%' ;