-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 24, 2017 at 01:11 PM
-- Server version: 5.1.53
-- PHP Version: 5.3.4

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `bankingsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank`
--

CREATE TABLE IF NOT EXISTS `bank` (
  `accno` int(10) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `balance` decimal(11,2) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phoneno` int(10) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bank`
--

INSERT INTO `bank` (`accno`, `name`, `balance`, `address`, `phoneno`, `sex`, `email`) VALUES
(781269289, 'maninder', '200022.00', NULL, NULL, NULL, NULL),
(1866218, 'pta nh', '41.00', 'zxs', 3221, 'Male', 'sfs'),
(12312, 'ab', '3000.00', '2077 sector 45c', 769660230, 'male', 'ram@gmail.com'),
(45, 'jk', '90.00', 'gj,chd', 63496494, 'Male', 'm@q.com'),
(322, 'asjka', '2121.00', 'ad jdaa', 21214422, 'Male', 'dsjsns'),
(63, 'ra', '1221.00', 'sjdnkjsk', 3223, 'Male', 'gmail');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `type` varchar(30) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`, `type`) VALUES
('admin', 'admin', 'admin'),
('hi1', 'hi1', 'admin'),
('', '', 'user'),
('adm', 'adm', 'admin'),
('hi99', 'hi99', 'admin'),
('', '', 'admin');
