-- 1. ���̺��� ��� ������ ��������
SELECT * FROM employees;

-- 2. where ���� ������ ���ǿ� �´� ���� �����Ѵ�.
-- ��ġ�� FROM�� ������ ��ġ
SELECT * 
FROM employees
WHERE department_id = 90; --90�� �μ���

SELECT * 
FROM employees
WHERE salary = 24000; --�޿��� 24000�� ����

/*where ���� ����� �� ������
����(String)�� ��¥(Date) ���� �׻� ����ǥ(')�� ǥ��
���ڰ��� ��ҹ��ڸ� �����Ѵ�.(Case-Sensitive)
��¥���� ��¥���˿� ����� �ʵ���(Format-Sensitive)
����Ŭ�� ��¥������ RR/MM/DD(RR�� 2�ڸ� �⵵)
*/
-- 3. WHERE + ���ڿ�
SELECT employee_id, first_name, last_name, job_id
FROM  employees
WHERE  first_name = 'Steven';
-- 4. WHERE + ��¥
SELECT SYSDATE FROM DUAL; 
-- DUAL�� �������̺� SYSDATE�� ���� ��¥ �ð�

SELECT *
FROM employees
WHERE hire_date >= '03/06/17'; --��/��/��

-- 5. �� ������
SELECT *
FROM employees
WHERE salary >= 10000; --���� ��

SELECT *
FROM employees
WHERE hire_date >= '03/06/17'; --��¥ ��

SELECT *
FROM employees
WHERE first_name > 'King'; --���� ��(���ĺ���)

-- ���� 1 employees ���̺��� employee_id �� 100�� ���� ������ ����ϼ���.
SELECT *
FROM employees
WHERE employee_id = 100;

-- ���� 2 employees ���̺��� first_name�� David�� ���� ������ ����ϼ���.
SELECT *
FROM employees
WHERE first_name = 'David';

-- ���� 3 employees ���̺��� employee_id�� 105������ ���� ������ ����ϼ���.
SELECT *
FROM employees
WHERE employee_id <= 105;

-- ���� 4 jod_history ���̺��� start_date�� 2006��3��3�� ������ ���� ������ ���
SELECT *
FROM job_history
WHERE start_date > '06/03/03';

-- ���� 5 department ���̺��� location_id�� 1700�� �ƴ� ��� �μ��� ����ϼ���.
SELECT *
FROM departments
--WHERE location_id <> 1700;
WHERE location_id !=1700;

-- 6. AND OR NOT
SELECT *
FROM employees
WHERE department_id = 60 OR 
    (department_id = 80 AND salary > 10000);
    
SELECT *
FROM employees
WHERE (department_id = 60 OR 
    department_id = 80) AND salary > 10000;

SELECT *
FROM employees
WHERE hire_date > '08/04/04' OR salary > 13000
    AND job_id = 'AD_VP';
    
SELECT *
FROM employees
WHERE NOT (hire_date > '04/01/01' OR salary > 5000);
-- (hire_dare <= '04/01/01' AND salary <= 5000);

-- ���� 1 employees ���̺��� salary�� 4000�� �ʰ��ϸ鼭
SELECT *
FROM employees
WHERE salary > 4000 AND job_id = 'IT_PROG';

-- ���� 2
SELECT *
FROM employees
WHERE salary > 4000 AND (job_id = 'IT_PROG' OR job_id = 'FI_ACCOUNT');

-- IN ������
SELECT *
FROM employees
WHERE salary = 4000 OR salary =3000 OR salary = 2700;

SELECT *
FROM employees
WHERE salary IN (4000, 3000, 2700);

-- ���� 1
SELECT *
FROM employees
WHERE salary IN (10000, 17000, 24000);

-- ���� 2
SELECT *
FROM employees
WHERE department_id NOT IN (30, 50 ,80 ,100, 110);

-- BETWEEN ������
SELECT *
FROM employees
WHERE salary >= 9000 AND salary <= 10000;

SELECT *
FROM employees
WHERE salary BETWEEN 9000 AND 10000;

-- ���� 1
SELECT *
FROM employees
WHERE salary BETWEEN 10000 AND 20000;

-- ���� 2
SELECT *
FROM employees
WHERE hire_date BETWEEN '04/01/01' AND '04/12/30';

-- ���� 3
SELECT *
FROM employees
WHERE salary NOT BETWEEN 7000 AND 17000 ;

/* LIKE �����ڴ� _�� %�� ���
%(�ۼ�Ʈ)�� ���ڰ� 0�� �Ǵ� 1�� �̻�
_(�����)�� ���ڰ� 1��
*/

-- LIKE ������
SELECT *
FROM employees
WHERE last_name LIKE 'B%'; -- �빮�� B�� �����ϴ� �̸�

SELECT *
FROM employees
WHERE last_name LIKE '%b%'; -- �̸��� b�� ������ ���

SELECT *
FROM employees
WHERE first_name LIKE '_d%'; --ù���� �ڿ� d�� ������ ���

SELECT *
FROM employees
WHERE first_name LIKE '__s%'; -- ����° ���ڰ� s�϶� ���

-- ���� 1
SELECT *
FROM employees
WHERE job_id LIKE '%AD%'; --job_id�� AD�� �����ϴ� ��� �����͸� ��ȸ

-- ���� 2 *
SELECT *
FROM employees
WHERE job_id LIKE '%AD___'; --job_id�� AD�� �����ϸ鼭 AD�ڿ� ������� ���ڿ��� 3�ڸ��� �����͸� ���

-- ���� 3
SELECT *
FROM employees
WHERE phone_number LIKE '%1234'; -- ��ȭ��ȣ ���ڸ��� 1234�� ������ �������� ���

-- ���� 4 * 
SELECT *
FROM employees
WHERE phone_number NOT LIKE '%3%' AND phone_number LIKE '%9'; --��ȭ��ȣ�� 3�� ���� �����鼭 ��ȭ��ȣ ���ڸ��� 9�� ������ ���������� ���

-- ���� 5
SELECT *
FROM employees
WHERE job_id LIKE '%MGR' OR job_id LIKE '%ASST'; --job_id�� MGR�� �����ϰų� ASST�� �����ϴ� ���������� ���

--is NULL / is NOT NULL
SELECT *
FROM employees
WHERE commission_pct IS NULL; -- == NULL (X)

SELECT *
FROM employees
WHERE commission_pct IS NOT NULL;

-- ���� 1
SELECT *
FROM employees
WHERE manager_id IS NULL;

-- ORDER BY
SELECT *
FROM employees
ORDER BY salary ; -- ASC �⺻�� ��������

SELECT *
FROM employees
ORDER BY salary DESC; -- �������� (�������� ����)

SELECT *
FROM employees
ORDER BY last_name; -- ���ڴ� ���ĺ� ������ ����

SELECT *
FROM employees
ORDER BY last_name DESC; -- ���ĺ� ������������ ����

-- ��Ƽ����
SELECT employee_id, last_name, department_id
FROM employees
ORDER BY department_id, employee_id DESC; --�μ���ȣ�� ���� �� �����ȣ�� ����

-- ���� �����Ͽ� ����
SELECT employee_id, last_name, salary*12 ����
FROM employees
ORDER BY ���� DESC; --������ ū ������ ����

-- ORDER BY�� WHERE �� ������ ��ġ
SELECT employee_id, last_name, salary*12 ����
FROM employees
WHERE department_id = 90 -- 90�� �μ�
ORDER BY ���� DESC; -- ������ ū ������ ����

-- ���� 1
SELECT employee_id, first_name, last_name
FROM employees
ORDER BY employee_id DESC; -- employee_id ���� �������� ����

-- ���� 2
SELECT *
FROM employees
WHERE job_id LIKE '%CLERK%'
ORDER BY salary DESC; -- job_id�� CLERK��� �ܾ ���鼭 salary�� ���� ���� �� ����

-- ���� 3
SELECT employee_id AS "������ȣ", first_name AS "�����̸�", department_id AS "�μ���ȣ", salary AS "����"
FROM employees
WHERE employee_id BETWEEN 120 AND 150
ORDER BY department_id DESC, salary DESC; -- employee_id �� 120 ���� 150�� ���� ������ �μ���ȣ�� ū ������ �����ϰ� �μ���ȣ�� ���ٸ� ���� ū ������ ����

