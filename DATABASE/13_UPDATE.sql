-- UPDATE : 데이터 수정하기

-- UPDATE 사용시 WHERE 절에 항상 기본키를 활용한다.
CREATE TABLE copy_emp
AS
SELECT *
FROM employees;

UPDATE copy_emp
SET salary = 24100
WHERE department_id = 100;
COMMIT;

SELECT *
FROM copy_emp;

-- 의도치 않게 이름이 같은 사람들이 업데이트 됨.
UPDATE copy_emp
SET salary = 24100
WHERE first_name = 'Steven';

-- WHERE 절을 사용하지 않았을때
UPDATE copy_emp
SET phone_number = '123-456-789';

-- 예제 1
UPDATE copy_departments
SET manager_id = 100, location_id = 1800
WHERE department_id = 74;

UPDATE copy_departments
SET manager_id = 100, location_id = 1800
WHERE department_id = 75;
COMMIT;

UPDATE copy_departments
SET manager_id = '100'
WHERE department_id BETWEEN 150 AND 200;