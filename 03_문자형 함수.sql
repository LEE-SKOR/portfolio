-- ������ �Լ��� ��ҹ��� �Լ��� ���� �����Լ��� ������.

-- 1. ��ҹ��� ���� �Լ� (upper, lowerm inticap)
SELECT 1+1
FROM DUAL; -- ������̺��� ������ ���̺�

SELECT LOWER('SQL COURSE'), UPPER('sql course'), INITCAP ('SQL COURSE')
FROM DUAL;

-- �����Լ��� where���� ���
SELECT employee_id, first_name
FROM employees
WHERE UPPER(first_name) = 'PATRICK';

-- 2. ���� �����Լ�
-- CONCAT (���ڿ��� ��ħ)
SELECT first_name, last_name, CONCAT(first_name, last_name) AS "Ǯ����"
FROM employees;

-- SUBSTR (�� �̸�, m, n) : m�� ���۹���, n�� �߶� ����
SELECT employee_id,first_name,
SUBSTR(first_name, 1, 3), -- ù��°���� ����°����
SUBSTR(first_name, 2, 4), -- �ι�°���� �׹�°����
SUBSTR(first_name, 2), -- �ι�°���� ������
SUBSTR(first_name, -3) -- ���������� ������ (�����϶� ���������� ī��Ʈ)
FROM employees;

-- LENGTH (���ڿ��� ���̸� �˷��ش�.(����))
SELECT first_name, LENGTH(first_name)
FROM employees;

-- INSTR(���ڿ�, ã�� ����, m, n)
-- m�� �˻� ���� ��ġ
-- n�� ã�� Ƚ��
-- ����Ʈ���� m,n ���� 1
SELECT first_name,
INSTR(first_name, 'e', 2), -- �ι�° ���ں��� e�� �˻�
INSTR(first_name, 'e', 5), -- �ټ���° ���ں��� e�� �˻�
INSTR(first_name, 'e', 1, 2) -- ù��° ���ں��� �ι�° e�� �˻�
FROM employees
where first_name = 'Nanette';

--LPAD / RPAD (���ڿ�, �ڸ���, ä�﹮��)
SELECT employee_id, first_name, salary,
    LPAD(salary,10,'#'), -- ������ �칰�� + ���ڰ� 10�ڸ��� �ǵ���
    RPAD(salary,10,'#') -- ������ �칰�� + ���ڰ� 10�ڸ��� �ǵ���
FROM employees;

-- ������ �̿��ؼ� ���ڿ��� �и�
SELECT 
'ȫ �浿' ����,
SUBSTR('ȫȫ �浿',1,INSTR('ȫȫ �浿',' ')-1) ��,
SUBSTR('ȫȫ �浿',INSTR('ȫȫ �浿',' ')+1) �̸�
FROM DUAL;

-- ������ �Լ� ����
SELECT last_name, CONCAT('�������� ', job_id) AS "������"
FROM employees
WHERE SUBSTR(job_id, 4, 3) = 'REP'; -- job_id�� 4��° ���ں��� REP�� ���

SELECT employee_id,
    CONCAT(first_name, last_name) ��ü�̸�,
    last_name,
    LENGTH(last_name) ����,
    INSTR(last_name, 'a') "'a'�� ���°?"
FROM employees;

SELECT first_name, last_name,
    UPPER(CONCAT(first_name, SUBSTR(last_name, 1,3))) �̸��ռ�
FROM employees
WHERE department_id = 60;

-- ���� ġȯ : REPLACE
SELECT job_id, REPLACE(job_id, 'ACCOUNT', 'ACCNT') ����
FROM employees
WHERE job_id LIKE '%ACCOUNT%';

-- ���� 1
SELECT last_name �̸�, LOWER(last_name),UPPER (last_name), email, INITCAP(email) 
FROM employees
ORDER BY last_name ;

-- ���� 2
SELECT job_id, SUBSTR(job_id,1, 2)
FROM employees;