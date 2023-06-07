
CREATE DATABASE ventasgobd;

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
  
CREATE TABLE `ventasgobd`.`producto` (
  `codProducto` INT NOT NULL AUTO_INCREMENT,
  `marcaProducto` VARCHAR(20) NOT NULL,
  `modeloProducto` VARCHAR(20) NOT NULL,
  `precioProducto` VARCHAR(8) NOT NULL,
  `stockProducto` INT NOT NULL,
  `caracteristicasProducto` VARCHAR(100) NOT NULL,
  `fotoProducto` LONGBLOB NOT NULL,
  PRIMARY KEY (`codProducto` ));
  
CREATE TABLE `ventasgobd`.`proveedor` (
  `codProveedor` INT NOT NULL AUTO_INCREMENT,
  `nombreProveedor` VARCHAR(40) NOT NULL,
  `nitProveedor` VARCHAR(14) NOT NULL,
  `telefonoProveedor` VARCHAR(9) NOT NULL,
  `emailProveedor` VARCHAR(100) NOT NULL,
  `direccionProveedor` VARCHAR(100) NOT NULL,
  `descripcionProveedor` VARCHAR(300) NOT NULL,
  PRIMARY KEY (`codProveedor` ));