CREATE DATABASE db_cidade_das_frutas;

USE db_cidade_das_frutas;

CREATE TABLE tb_categorias(
	id_categoria INT(10) AUTO_INCREMENT,
    tipo ENUM("Fruta", "Verdura", "Legumes"),
    estacao VARCHAR(50) NOT NULL,
	PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produtos (
	id_produto INT(10) AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
    valor DECIMAL(10, 2) NOT NULL, 
    peso DECIMAL(10, 2) NOT NULL,
    fk_categoria INT(10) NOT NULL,
    FOREIGN KEY (fk_categoria) REFERENCES tb_categorias (id_categoria),
    PRIMARY KEY (id_produto)
);

INSERT INTO tb_categorias (tipo, estacao) VALUES
("Fruta", "Verão"),
("Fruta", "Outono"),
("Verdura", "Primavera"),
("Legumes", "Inverno"),
("Legumes", "Verão");

SELECT * FROM tb_categorias ;

INSERT INTO tb_produtos (nome, valor, peso, fk_categoria) VALUES
("Abacaxi", 5.99, 1.5, 1),
("Carambola", 7.99, 1.0, 2),
("Brocólis", 50.99, 2.0, 3),
("Abóbora", 5.99, 1.5, 4),
("Beterraba", 20.99, 1.5, 5),
("Chuchu", 10.99, 1.5, 5);

SELECT * FROM tb_produtos WHERE valor > 50.00 ;

SELECT * FROM tb_produtos WHERE valor BETWEEN 3 AND 60 ;

SELECT * FROM tb_produtos WHERE nome LIKE 'c%' ;

SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria ;

SELECT * FROM tb_produtos
	INNER JOIN tb_categorias ON tb_categorias.id_categoria = tb_produtos.fk_categoria 
WHERE tb_categorias.tipo = "Legumes"