-- DELETE 데이터의 삭제

-- 71번~75번 부서번호 삭제
DELETE FROM departments
WHERE department_id BETWEEN 71 AND 75;
COMMIT;

DELETE FROM departments
WHERE department_id = 5;
COMMIT;

-- 직원테이블 id 1, 2 삭제
DELETE FROM employees
WHERE employee_id IN(1,2);
COMMIT;

-- 테이블 전체를 삭제 : 데이터만 삭제 ROLLBACK 가능
DELETE FROM copy_departments;
ROLLBACK;

-- TRUNCATE TABLE : 전체 삭제인데 ROLLBACK이 안됨
TRUNCATE TABLE copy_departments;
ROLLBACK;

-- DROP TABLE : 테이블 삭제
DROP TABLE copy_departments;
DROP TABLE copy_dept;
DROP TABLE XX_emp;

-- SAVEPOINT
SELECT * FROM copy_emp
WHERE employee_id = 108; -- Salary 12008

UPDATE copy_emp 
SET salary = salary + 10
WHERE employee_id = 108;
-- Salary 값이 12018
-- SAVEPOINT A 만들기
SAVEPOINT A;

UPDATE copy_emp 
SET salary = salary + 20
WHERE employee_id = 108;
-- Salary 값이 12038

-- SAVEPOINT A 로 ROLLBACK
ROLLBACK TO SAVEPOINT A;
-- Salary 값이 12018
-- ROLLBACK
ROLLBACK;

COMMIT;
