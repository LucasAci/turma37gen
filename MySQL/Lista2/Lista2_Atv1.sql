-- CRIAR BANCO DE DADDOS
CREATE database db_generation_game_oline;

-- USAR BANCO DE DADOS
USE db_generation_game_oline;

CREATE TABLE tb_classe(
id_jogo int (10) auto_increment not null,
nome_jogo varchar(50),
fabricante varchar(50),
primary key (id_jogo)
);

CREATE table tb_personagem(
id_personagem int (10) auto_increment not null,
nome_personagem varchar(50),
poder_ataque int,
poder_defesa int,
poder_agilidade int,
classe varchar (50),
foreign key (id_jogo) references tb_classe (id_jogo),
primary key (id_personagem)
);

INSERT INTO tb_classe (id_jogo, nome_jogo, fabricante) values
 (001 , "Dragon Age", "BioWare"), 
 (002, "Pokemon Go", "Nitendo"),
 (003, "Zelda", "Nitendo"),
 (004, "Mario Kart", "Nitendo"),
 (005, "Fifa" , "E&A Sports");
 
 INSERT INTO tb_personagem (id_personagem, nome_persoagem, poder_ataque,
 poder_defesa, poder_agilidade, classe) values 
 (111, "Luke", 2500, 150, 55, "Guerreito")
 (222, "Ash", 80, 100
 
 
 

