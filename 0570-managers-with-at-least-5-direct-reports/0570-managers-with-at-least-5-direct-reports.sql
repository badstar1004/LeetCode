# Write your MySQL query statement below
-- SELECT e.name
--   FROM Employee e
--  WHERE e.id IN (SELECT managerId
--                   FROM Employee
--                  WHERE managerId IS NOT NULL
--               GROUP BY managerId
--                 HAVING COUNT(*) >= 5);

    SELECT e.name
      FROM Employee e
INNER JOIN Employee e2
        ON e.id     = e2.managerId
  GROUP BY e.id
         , e.name
    HAVING COUNT(e.id) >= 5;