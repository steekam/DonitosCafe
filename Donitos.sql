-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 20, 2018 at 07:26 AM
-- Server version: 10.2.9-MariaDB
-- PHP Version: 7.1.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Donitos`
--

-- --------------------------------------------------------

--
-- Table structure for table `expenses`
--

CREATE TABLE `expenses` (
  `EntryNo` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Description` text NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `ItemCode` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Price` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`ItemCode`, `Name`, `Type`, `Price`) VALUES
('01', 'Breakfast eggs,sausage,toast/chips', 'breakfast', 200),
('02', 'Tea Mug', 'breakfast', 30),
('03', 'Tea pot', 'breakfast', 70),
('04', 'Lemon Tea', 'breakfast', 40),
('05', 'Lemon Tea w/honey', 'breakfast', 70),
('06', 'Coffe Mug', 'breakfast', 40),
('07', 'Coffe Pot', 'breakfast', 100),
('08', 'Milo/Chocolate', 'breakfast', 80),
('09', 'Milk glass/mug', 'breakfast', 70),
('10', 'Porridge', 'breakfast', 50),
('11', 'Fresh Juice', 'breakfast', 100),
('12', 'Sausage', 'snacks', 40),
('13', 'Mandazi', 'snacks', 10),
('14', 'Chapati', 'snacks', 20),
('15', 'Toast', 'snacks', 30),
('16', 'Ngwaci /Nduma', 'snacks', 40),
('17', 'Brown Beef Stew', 'meals', 150),
('18', 'Matumbo', 'meals', 130),
('19', 'Fried Chicken', 'meals', 200),
('20', 'Kienyeji Chicken', 'meals', 300),
('21', 'Gizard stew', 'meals', 250),
('22', 'Liver', 'meals', 200),
('23', 'Omena', 'meals', 120),
('24', 'Ndengu', 'meals', 120),
('25', 'Beans', 'meals', 120),
('26', 'Njahi', 'meals', 120),
('27', 'Matoke', 'meals', 120),
('28', 'Githeri', 'meals', 120),
('29', 'Githeri special', 'meals', 150),
('30', 'Kunde', 'meals', 120),
('31', 'Mukimo', 'meals', 120),
('32', 'Chips', 'meals', 100);

-- --------------------------------------------------------

--
-- Stand-in structure for view `monthlySale`
-- (See below for the actual view)
--
CREATE TABLE `monthlySale` (
);

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `Date` date NOT NULL,
  `Sales` int(11) NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`Date`, `Sales`, `Amount`) VALUES
('2018-01-20', 1, 200);

-- --------------------------------------------------------

--
-- Structure for view `monthlySale`
--
DROP TABLE IF EXISTS `monthlySale`;
-- Error reading structure for table Donitos.monthlySale: #1046 - No database selected

--
-- Indexes for dumped tables
--

--
-- Indexes for table `expenses`
--
ALTER TABLE `expenses`
  ADD PRIMARY KEY (`EntryNo`),
  ADD KEY `Date` (`Date`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`ItemCode`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`Date`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `expenses`
--
ALTER TABLE `expenses`
  MODIFY `EntryNo` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
