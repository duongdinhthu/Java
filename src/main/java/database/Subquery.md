Subquery (Subquery hoặc Nested Query)
Subquery là một truy vấn lồng vào trong một câu truy vấn khác.
Nó thường được dùng để lọc, tính toán hoặc cung cấp giá trị cho phần còn lại của truy vấn.

Subquery trong WHERE:
SELECT name FROM employees
WHERE department_id IN (SELECT id FROM departments WHERE name = 'HR');

Subquery trong FROM:
SELECT sub.name, sub.salary
FROM (SELECT name, salary FROM employees WHERE salary > 50000) AS sub;


.
