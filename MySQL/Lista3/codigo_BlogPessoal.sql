-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_Blog
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_Blog
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_Blog` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
-- -----------------------------------------------------
-- Schema db_escola
-- -----------------------------------------------------
USE `db_Blog` ;

-- -----------------------------------------------------
-- Table `db_Blog`.`Temas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Blog`.`Temas` (
  `id_temas` BIGINT NULL AUTO_INCREMENT,
  `descricao varchar(255)` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_temas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Blog`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Blog`.`Usuarios` (
  `id_usurarios` BIGINT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `usuario` VARCHAR(255) NOT NULL,
  `senha` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_usurarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_Blog`.`Postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_Blog`.`Postagens` (
  `id_postagem` BIGINT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `texto` VARCHAR(1000) NOT NULL,
  `data` TIMESTAMP NOT NULL,
  `temas_id` BIGINT NOT NULL,
  `tsuarios_id` BIGINT NOT NULL,
  PRIMARY KEY (`id_postagem`, `temas_id`, `tsuarios_id`),
  INDEX `fk_Temas_has_Usuarios_Usuarios1_idx` (`tsuarios_id` ASC) VISIBLE,
  INDEX `fk_Temas_has_Usuarios_Temas_idx` (`temas_id` ASC) VISIBLE,
  CONSTRAINT `fk_Temas_has_Usuarios_Temas`
    FOREIGN KEY (`temas_id`)
    REFERENCES `db_Blog`.`Temas` (`id_temas`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Temas_has_Usuarios_Usuarios1`
    FOREIGN KEY (`tsuarios_id`)
    REFERENCES `db_Blog`.`Usuarios` (`id_usurarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
