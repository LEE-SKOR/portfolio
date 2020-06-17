-- ������ �ּ��Դϴ�. ����Ű�� CTRL+/
/*������ �ּ�*/

/*SELECT *FROM departments;
SELECT location_id "���� ��ȣ", department_id "�μ� ��ȣ" FROM departments;
--as�� ���������ϰ�, ��Ī�� Ư�����ڰ�(���� ����) ���ԵǴ� ��쿡�� �ֵ���ǥ�� �־�� ������ ���� �ʴ´�.*/

-- 1.���̺��� ��� ��� ���� �о���� *
SELECT *
FROM departments;

-- 2.Ư�� ���� �о����
select department_id, department_name
from departments;

-- 3.��� ������ ���(+,-,*,/
SELECT employee_id, first_name, salary
FROM employees;

SELECT employee_id, first_name, salary+100
FROM employees;

SELECT last_name, first_name, job_id, salary, salary-salary/10
FROM employees;

--4.��(NULL) �̶�?
-- ���� �Էµ��� ����, ������� ����, �˼����� ��
-- �ΰ��� ����(0) �Ǵ� ����("")���� �ٸ���.
SELECT last_name, job_id, salary, commission_pct
FROM employees;

SELECT last_name, job_id, salary, commission_pct, commission_pct+10
FROM employees;

-- 5.�ߺ��� �� ���� :distinct
SELECT DISTINCT job_id
FROM employees;

-- ����1
SELECT employee_id, first_name, last_name
FROM employees;

-- ����2
SELECT first_name, salary, salary*1.1 as "��������"
FROM employees;

-- ����3
SELECT employee_id as "�����ȣ", first_name as "�̸�", last_name as "��"
FROM employees;

-- 6.���� ������(||)
SELECT last_name || ' is a ' || job_id as "���� ����"
FROM employees;

SELECT employee_id, first_name||' '||last_name
FROM employees;

-- ����4
SELECT employee_id, first_name||' '||last_name, email||' @company.com'
FROM employees;

