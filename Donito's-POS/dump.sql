;              
CREATE USER IF NOT EXISTS SA SALT '6fade4986e192592' HASH '2b5a2ea1ed76ef3680b634d9dcb9e4e30afa6ac1c5c10d67c2088b7650cf89c1' ADMIN;            
CREATE SEQUENCE PUBLIC.SYSTEM_SEQUENCE_75A1F985_B088_4CBA_A696_C201D6E264EA START WITH 2 BELONGS_TO_TABLE;     
CREATE FORCE VIEW PUBLIC.MONTHLYSALES(MONTH, YEAR, SALES, EXPENSES, PROFIT) AS
SELECT
    TSALES.MONTH AS MONTH,
    TSALES.YEAR AS YEAR,
    SALES,
    EXPENSES,
    (SALES - EXPENSES) AS PROFIT
FROM (
    SELECT
        SUM(AMOUNT) AS SALES,
        MONTHNAME(DATE) AS MONTH,
        YEAR(DATE) AS YEAR
    FROM PUBLIC.SALES
    GROUP BY MONTHNAME(DATE), YEAR(DATE)
) TSALES
INNER JOIN (
    SELECT
        SUM(AMOUNT) AS EXPENSES,
        MONTHNAME(DATE) AS MONTH,
        YEAR(DATE) AS YEAR
    FROM PUBLIC.EXPENSES
    GROUP BY MONTHNAME(DATE), YEAR(DATE)
) TEXPENSES
    ON 1=1
WHERE TSALES.MONTH = TEXPENSES.MONTH
GROUP BY TSALES.MONTH, TSALES.YEAR;               
CREATE CACHED TABLE PUBLIC.MENU(
    ITEMCODE VARCHAR(20) NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    TYPE VARCHAR(20) NOT NULL,
    PRICE INT NOT NULL
);    
ALTER TABLE PUBLIC.MENU ADD CONSTRAINT PUBLIC.CONSTRAINT_2 PRIMARY KEY(ITEMCODE);              
-- 32 +/- SELECT COUNT(*) FROM PUBLIC.MENU;    
INSERT INTO PUBLIC.MENU(ITEMCODE, NAME, TYPE, PRICE) VALUES
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
CREATE CACHED TABLE PUBLIC.SALES(
    DATE DATE NOT NULL,
    SALES INT NOT NULL,
    AMOUNT INT NOT NULL
);   
ALTER TABLE PUBLIC.SALES ADD CONSTRAINT PUBLIC.CONSTRAINT_4 PRIMARY KEY(DATE); 
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.SALES;    
CREATE CACHED TABLE PUBLIC.EXPENSES(
    ENTRYNO INT DEFAULT (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_75A1F985_B088_4CBA_A696_C201D6E264EA) NOT NULL NULL_TO_DEFAULT SEQUENCE PUBLIC.SYSTEM_SEQUENCE_75A1F985_B088_4CBA_A696_C201D6E264EA,
    DATE DATE NOT NULL,
    DESCRIPTION TEXT NOT NULL,
    AMOUNT INT NOT NULL
);     
ALTER TABLE PUBLIC.EXPENSES ADD CONSTRAINT PUBLIC.CONSTRAINT_B PRIMARY KEY(ENTRYNO);           
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.EXPENSES; 
CREATE INDEX PUBLIC.INDEX_DATE ON PUBLIC.EXPENSES(DATE);       
