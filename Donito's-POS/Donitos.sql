

CREATE TABLE `expenses` (
  `EntryNo` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Description` text NOT NULL,
  `Amount` int(11) NOT NULL
) ;

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `ItemCode` varchar(20) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Price` int(6) NOT NULL
) ;

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
) ;



-- --------------------------------------------------------



ALTER TABLE `expenses`
  ADD PRIMARY KEY (`EntryNo`);
  CREATE INDEX index_DATE ON `expenses` (`Date`);

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
  
--
-- CREATING VIEW for monthlysale table
--
CREATE VIEW monthlysales AS
(SELECT tSales.Month AS Month, 
tsales.Year AS Year,
Sales,
Expenses,
(Sales - Expenses) AS Profit 
FROM  (
    SELECT SUM(Amount) AS Sales, MONTHNAME(Date) AS Month,YEAR(Date) AS Year FROM sales GROUP BY Month,Year
    ) AS tSales
    INNER JOIN (
        SELECT SUM(Amount) AS Expenses, MONTHNAME(Date) AS Month, YEAR(Date) AS Year FROM expenses GROUP BY Month,Year
        ) AS tExpenses 
        ON tSales.Month = tExpenses.Month GROUP BY Month,Year
);

)
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
