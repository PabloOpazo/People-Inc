-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 16:02:03
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `employeedb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `nombre_completo` varchar(150) NOT NULL,
  `departamento` varchar(100) NOT NULL,
  `fecha_contratacion` date NOT NULL,
  `sueldo_mensual` double NOT NULL,
  `posicion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `employee`
--

INSERT INTO `employee` (`id`, `nombre_completo`, `departamento`, `fecha_contratacion`, `sueldo_mensual`, `posicion`) VALUES
(1, 'Marta González', 'Marketing', '2005-03-03', 1000000, 'Representante de Servicio al Cliente'),
(2, 'Alejandro Silva', 'Finanzas', '2003-08-21', 650000, 'Analista Financiero'),
(3, 'Laura Mendoza', 'Recursos Humanos', '2019-09-12', 1200000, 'Especialista en Recursos Humanos'),
(4, 'Juan López', 'Desarrollo de Productos', '2006-06-29', 1500000, 'Ingeniero de Desarrollo de Software'),
(5, 'Claudia Ramírez', 'Servicio al Cliente', '2010-05-19', 900000, 'Representante de Servicio al Cliente');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
