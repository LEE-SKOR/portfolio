-- DELETE �������� ����

-- 71��~75�� �μ���ȣ ����
DELETE FROM departments
WHERE department_id BETWEEN 71 AND 75;
COMMIT;

DELETE FROM departments
WHERE department_id = 5;
COMMIT;

-- �������̺� id 1, 2 ����
DELETE FROM employees
WHERE employee_id IN(1,2);
COMMIT;

-- ���̺� ��ü�� ���� : �����͸� ���� ROLLBACK ����
DELETE FROM copy_departments;
ROLLBACK;

-- TRUNCATE TABLE : ��ü �����ε� ROLLBACK�� �ȵ�
TRUNCATE TABLE copy_departments;
ROLLBACK;

-- DROP TABLE : ���̺� ����
DROP TABLE copy_departments;
DROP TABLE copy_dept;
DROP TABLE XX_emp;

-- SAVEPOINT
SELECT * FROM copy_emp
WHERE employee_id = 108; -- Salary 12008

UPDATE copy_emp 
SET salary = salary + 10
WHERE employee_id = 108;
-- Salary ���� 12018
-- SAVEPOINT A �����
SAVEPOINT A;

UPDATE copy_emp 
SET salary = salary + 20
WHERE employee_id = 108;
-- Salary ���� 12038

-- SAVEPOINT A �� ROLLBACK
ROLLBACK TO SAVEPOINT A;
-- Salary ���� 12018
-- ROLLBACK
ROLLBACK;

COMMIT;
