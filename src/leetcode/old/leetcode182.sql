-- solution 1
SELECT DISTINCT x.email FROM Person x, Person y WHERE x.email = y.email and x.id <> y.id;

-- solution 2
SELECT x.email FROM Person x GROUP BY x.email HAVING COUNT(x.email) > 0;

