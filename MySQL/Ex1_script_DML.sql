-- DML (Linguagem de manipulação de dados)
-- INSERT --|           CREATE
-- UPDATE   |--> CRUD   UPDATE
-- DELETE   |			DELETE
-- SELECT___|           READ

-- INSERT
INSERT INTO tb_usuarios (nome, email, senha, carteira)
VALUES
("Bart Boaz", "bart@email.com", "134652", 0.0);

INSERT INTO tb_usuarios (nome, email, senha, carteira)
VALUES
("Amâncio Boaz", "amancio@email.com", "134652", 0.0),
("Julia Boaz", "juylia@email.com", "134652", 0.0);

INSERT INTO tb_produtos (produto, preco, fk_usuario)
VALUES
("Macarronada ao molho Branco", 12.00, 1),
("Macarronada alho e óleo", 7.00, 1),
("Macarronada Tradicional", 10.00, 3);

INSERT INTO tb_ordens (data_ordem, status_ordem, email_comprador, chave, fk_produto)
VALUES
('2021-10-22', "AGUARDANDO", "gustavo@email.com", "JHYuiyfTYdY46576", 5),
('2021-10-22', "AGUARDANDO", "arthur@email.com", "UFITRGVHLI546518", 2),
('2021-10-22', "AGUARDANDO", "matheus@email.com", "UFJHOYT46871984", 2);

-- SELECT
SELECT * FROM tb_usuarios ;
SELECT * FROM tb_produtos ;
SELECT * FROM tb_ordens ;

SELECT produto, preco FROM tb_produtos ORDER BY preco ASC ;

SELECT status_ordem AS `STATUS` , COUNT(*) AS Quantidade
FROM tb_ordens
GROUP BY status_ordem ORDER BY status_ordem ASC;

-- UPDATE
UPDATE tb_usuarios
SET senha = "987654"
WHERE id_usuario = 1;

SET SQL_SAFE_UPDATES =0;
UPDATE tb_usuarios
SET nome = "Bartolomeu Boaz"
WHERE email = "bart@email.com";

UPDATE tb_produtos
SET preco = 9.50;

-- DELETE
DELETE FROM tb_ordens
WHERE id_ordem = 3;