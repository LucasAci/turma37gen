-- paygen
-- DML

-- USUARIOS QUE POSSUEM ORDENS
INSERT INTO tb_usuarios (nome, email, senha, token)
VALUES
("Renan Boaz","renan@email.com","134652","ZSERDX"),
("Ceci Boaz","ceci@email.com","134652","NJIMKO");

-- USUARIOS QUE NÃO POSSUEM ORDEM
INSERT INTO tb_usuarios (nome, email, senha, token)
VALUES
("Sylvia Boaz","sylvia@email.com","134652","VGYUHB"),
("Mayara Boaz","mayara@email.com","134652","NJIMKO"),
("Guilherme Boaz","guilherme@email.com","134652","VGYBHU");

-- ORDENS QUE POSSUEM UM CRIADOR
INSERT INTO tb_ordens_pagamento (data_solicitacao, data_limite, valor, status_pagamento, email_comprador, cpf_comprador, fk_responsavel)
VALUES
('2021-10-25',"2021-10-26", 50.00,"PENDENTE","danilo@email.com","458.265.753-95",1),
('2021-10-25',"2021-10-26", 40.00,"PENDENTE","bruna@email.com","578.546.256-65",1),
('2021-10-25',"2021-10-26", 70.00,"PENDENTE","alyson@email.com","165.569.423-12",1),
('2021-10-23',"2021-10-24", 40.00,"PAGO","jady@email.com","325.125.635-45",1),
('2021-10-22',"2021-10-23", 30.00,"PAGO","vinicius@email.com","235.562.124-23",2),
('2021-10-20',"2021-10-21", 100.00,"CANCELADO","bart@email.com","569.235.451-65",2);

-- ORDENS QUE NÃO POSSUEM UM CRIADOR
INSERT INTO tb_ordens_pagamento (data_solicitacao, data_limite, valor, status_pagamento, email_comprador, cpf_comprador)
VALUES
('2021-10-25',"2021-10-26", 200.00,"PENDENTE","marcelo@email.com","245.685.456-12"),
('2021-10-25',"2021-10-26", 150.00,"PENDENTE","fernanda@email.com","356.845.124-36"),
('2021-10-25',"2021-10-26", 300.00,"PENDENTE","lauro@email.com","125.458.753-44");