        CREATE TABLE IF NOT EXISTS `proyectosP`.`tareas` (
          `id` INT NOT NULL AUTO_INCREMENT,
          `title` VARCHAR(45) NULL,
          `description` VARCHAR(45) NULL,
          `proyectos_id` INT NOT NULL,
          PRIMARY KEY (`id`),
          CONSTRAINT `fk_tareas_proyectos`
            FOREIGN KEY (`proyectos_id`)
            REFERENCES `proyectosP`.`proyectos` (`id`))