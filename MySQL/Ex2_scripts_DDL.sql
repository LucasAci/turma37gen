-- paygen
-- DDL

CREATE DATABASE paygen;
USE paygen;

CREATE TABLE tb_usuarios(
	id_usuario INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    email VARCHAR(255),
    senha VARCHAR(255),
    token VARCHAR(255),
    carteira FLOAT DEFAULT 0.00,
    PRIMARY KEY (id_usuario)
);

CREATE TABLE tb_ordens_pagamento(
	id_ordem INT NOT NULL AUTO_INCREMENT,
    data_solicitacao DATE,
    data_limite DATE,
    valor FLOAT,
    status_pagamento ENUM('PENDENTE','CANCELADO','PAGO'),
    email_comprador VARCHAR(255),
    cpf_comprador VARCHAR(255),
    fk_responsavel INT,
    PRIMARY KEY (id_ordem),
    FOREIGN KEY (fk_responsavel) REFERENCES tb_usuarios(id_usuario)
);