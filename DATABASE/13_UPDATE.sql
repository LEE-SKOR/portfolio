-- UPDATE : ������ �����ϱ�

-- UPDATE ���� WHERE ���� �׻� �⺻Ű�� Ȱ���Ѵ�.
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

-- �ǵ�ġ �ʰ� �̸��� ���� ������� ������Ʈ ��.
UPDATE copy_emp
SET salary = 24100
WHERE first_name = 'Steven';

-- WHERE ���� ������� �ʾ�����
UPDATE copy_emp
SET phone_number = '123-456-789';

-- ���� 1
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