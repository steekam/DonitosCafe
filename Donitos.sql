-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 16, 2018 at 05:17 PM
-- Server version: 10.2.9-MariaDB
-- PHP Version: 7.1.12

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

--
-- Dumping data for table `expenses`
--

INSERT INTO `expenses` (`EntryNo`, `Date`, `Description`, `Amount`) VALUES
(2, '2018-01-08', 'Groceries', 200);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `ItemCode` varchar(20) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Price` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`ItemCode`, `Name`, `Type`, `Price`) VALUES
('1', 'Beef Stew', 'meals', 150),
('2', 'Kienyeji Chicken', 'meals', 250),
('3', 'Soda', 'drinks', 40),
('4', 'Tea', 'drinks', 40),
('5', 'Mandazi', 'snacks', 10),
('6', 'Samosa', 'snacks', 30),
('7', 'Eggs', 'breakfast', 40);

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
('2018-01-07', 4, 1121),
('2018-01-08', 5, 680),
('2018-01-09', 1, 371),
('2018-01-14', 5, 1110);

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
  MODIFY `EntryNo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
