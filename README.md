<<<<<<< HEAD
Sistema de Venta en Java y Mysql

Integrantes : *Becerra Eugenio Leidy Laura *Heredia Mendez Andrea Belen *Cantarran Villarroel Noelia *Espinoza Flores Noe Josue *Cadima Campos Luis Fernando *Flores Apaza Santos Jaime *Carrillo Arandia Franz Luis *Vera Vargas Ariel Leandro
=======
# crear una base de datos en mysql workbench 
# con  nombre root  y sin contraseña 
# user = "root";
# password = "";
# server = "localhost";
# puerto = "3306";
#copiar el  todo desde aqui abajo y funcionara.

CREATE DATABASE ventasgobd;

 use  ventasgobd;

CREATE TABLE `ventasgobd`.`usuarios` (
  `codUsuario` INT NOT NULL AUTO_INCREMENT,
  `nombreUsuario` VARCHAR(40) NOT NULL,
  `ciUsuario` VARCHAR(10) NOT NULL,
  `telefonoUsuario` VARCHAR(9) NOT NULL,
  `fechaInicioUsuario` DATE NULL,
  `idUsuario` VARCHAR(45) NOT NULL,
  `contraseniaUsuario` VARCHAR(15) NOT NULL,
  `direccionUsuario` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`codUsuario`));
>>>>>>> develop
