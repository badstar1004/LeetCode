    SELECT e.name
      FROM Employee e
INNER JOIN Employee e2
        ON e.id     = e2.managerId
  GROUP BY e.id
         , e.name
    HAVING COUNT(e.id) >= 5;