-- paygen
-- DML JOIN

-- INNER JOIN: Retorna registros que possuem valores correspondentes em ambas as tabelas
-- LEFT JOIN: Retorna todos os registros da tabela da esquerda e os registros correspondentes da tabela da direita
-- RIGHT JOIN: Retorna todos os registros da tabela da direita e os registros correspondentes da tabela da esquerda
-- FULL JOIN: Retorna todos os registros quando há uma correspondência na tabela da esquerda ou da direita

-- INNER JOIN
SELECT tb_usuarios.nome AS Responsavel, tb_usuarios.email AS Email, tb_ordens_pagamento.status_pagamento AS `Status`, tb_ordens_pagamento.email_comprador AS Devedor
FROM tb_usuarios -- ESQUERDA
INNER JOIN tb_ordens_pagamento -- DIREITA
ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel;

-- LEFT JOIN
SELECT tb_usuarios.nome AS Responsavel, tb_ordens_pagamento.status_pagamento, SUM(tb_ordens_pagamento.valor)
FROM tb_usuarios -- ESQUERDA
LEFT JOIN tb_ordens_pagamento -- DIREITA
ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel
GROUP BY tb_usuarios.nome, tb_ordens_pagamento.status_pagamento;

-- RIGHT JOIN
SELECT 	tb_usuarios.nome AS RESPONSAVEL,
		tb_ordens_pagamento.id_ordem AS `ID ORDEM`
FROM tb_usuarios -- ESQUERDA
RIGHT JOIN tb_ordens_pagamento -- DIREITA
ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel
WHERE tb_usuarios.nome IS NULL;

-- FULL JOIN (UNION)
SELECT * FROM tb_ordens_pagamento LEFT JOIN tb_usuarios ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel
UNION
SELECT * FROM tb_ordens_pagamento RIGHT JOIN tb_usuarios ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel;

-- Pesquisa com LIKE
SELECT * FROM tb_ordens_pagamento RIGHT JOIN tb_usuarios ON tb_usuarios.id_usuario = tb_ordens_pagamento.fk_responsavel
WHERE tb_usuarios.nome LIKE '%w';

-- Pesquisa com BETWEEN
SELECT * FROM tb_ordens_pagamento
WHERE tb_ordens_pagamento.valor BETWEEN 50 AND 100;

-- Pesquisa com IN
SELECT * FROM tb_ordens_pagamento
WHERE tb_ordens_pagamento.status_pagamento IN ("PAGO","CANCELADO");