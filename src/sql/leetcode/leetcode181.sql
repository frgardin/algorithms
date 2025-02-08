SELECT e1.name as Employee
  FROM Employee e1
 WHERE EXISTS(SELECT 1
                FROM Employee e2
               WHERE e2.salary < e1.salary
                 AND e2.id = e1.managerId);