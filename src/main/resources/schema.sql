DROP TABLE IF EXISTS Item;
DROP TABLE IF EXISTS Basket;

CREATE TABLE Item(
    id INT PRIMARY KEY,
    itemName VARCHAR(250) NOT NULL,
    price DOUBLE NOT NULL,
    qty INT NOT NULL
);

CREATE TABLE Basket(
    id INT PRIMARY KEY,
    itemName VARCHAR(250) NOT NULL,
    price DOUBLE NOT NULL,
    qty INT NOT NULL
);

-- Auto-Initialize Egg--
INSERT INTO Item(
    id,
    itemName,
    price,
    qty
)
VALUES
(1,'Egg',2.50,1000),
(2,'Milk',2.50,1000);