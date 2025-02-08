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

-- solution3
SELECT x.name AS Customers
FROM Customers x
LEFT JOIN Orders y
ON x.id = y.customerId
WHERE y.customerId IS NULL

-- solution 2 is faster than 1