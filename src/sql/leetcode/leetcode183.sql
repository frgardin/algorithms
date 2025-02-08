-- solution 1
SELECT x.name as Customers
FROM Customers x
WHERE NOT EXISTS(SELECT 1
                 FROM Orders y
                 WHERE y.customerId = x.id);

-- solution 2
SELECT name AS Customers From Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);

-- solution 2 is faster than 1