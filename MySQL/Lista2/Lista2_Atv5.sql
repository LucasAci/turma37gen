CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria
(
id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
tipo ENUM ("ALVENARIA", "MADEIRA", "PISOS", "TELHADO", "HIDRÁULICA"),
origem ENUM ("TIGRE", "POTY", "DELTA", "BRASILIT")
);

CREATE TABLE tb_produto
(
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(30) NOT NULL,
preco DOUBLE,
estoque INT,
fk_categoria INT,
FOREIGN KEY (fk_categoria) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(tipo, origem)
VALUES("ALVENARIA", "POTY"),
("MADEIRA", NULL),
("PISOS", "DELTA"),
("TELHADO", "BRASILIT"),
("HIDRÁULICA", "TIGRE");

INSERT INTO tb_produto(nome, preco, estoque, fk_categoria)
VALUES("Cimento", 70, 25, 1),
("Linha", 120, 15, 2),
("Cerâmica", 55, 10, 3),
("Tijolos", 550, 10000, 1),
("Telha", 350, 150, 4),
("Canos", 25, 1000, 5),
("Luva", 3.50, 250, 5),
("Conexão de cano", 5, 2000, 5);

SELECT * FROM tb_produto
WHERE preco > 50;

SELECT * FROM tb_produto
WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto
WHERE nome LIKE 'C%';

-- INNER
SELECT tb_categoria.tipo, tb_produto.nome
FROM tb_categoria -- COLUNA ESQUERDA 
INNER  JOIN tb_produto -- COLUNA DIREITA
ON tb_categoria.id = tb_produto.fk_categoria;

SELECT tb_categoria.tipo, tb_produto.nome
FROM tb_categoria -- COLUNA ESQUERDA 
INNER  JOIN tb_produto -- COLUNA DIREITA
ON tb_categoria.id = tb_produto.fk_categoria
WHERE tb_categoria.tipo = "HIDRÁULICA";