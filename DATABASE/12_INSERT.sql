-- DML �۾�

-- INSERT : �� ���� �Է��ϱ�
-- 1. ������ ���� ���������� Ȯ��(DESC + ���̺�)
DESC departments;

-- ��ü ���� �� �Է��ϴ� ���
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (71, '���ߺ� 1', 100, 1700);

SELECT *
FROM departments;
COMMIT;

-- ���� �̸��� ���� ��� ��ü ���� �� �Է��ؾ� ��
INSERT INTO departments
VALUES (72, '���ߺ� 2', 100, 1700);
COMMIT;

-- ���� ������ �ٲܰ��
INSERT INTO departments (department_name, manager_id, location_id, department_id)
VALUES ('���ߺ� 3', 100, 1700, 73);
COMMIT;

-- �ڵ����� �ΰ��Է�
INSERT INTO departments (department_id, department_name)
VALUES (74, '���ߺ� 4');
COMMIT;
DESC departments;

-- SYSDATE ���糯¥ �Է�
INSERT INTO employees(employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (1, 'ȫ', '�浿', 'hong@naver.com', SYSDATE, 'IT_PROG');
COMMIT;

SELECT *
FROM employees;
DESC employees;

-- ��¥ �Է��ϱ�
INSERT INTO employees(employee_id, first_name, last_name, email, hire_date, job_id)
VALUES (2, '��', '�浿', 'kang@naver.com', TO_DATE('2020-04-05','YYYY-MM-DD'), 'IT_PROG');
COMMIT;

-- ����ڷκ��� �Է¹ޱ�
INSERT INTO departments (department_id, department_name)
VALUES (&id, '&name'); -- 75 ���ߺ� 5
COMMIT;

-- ���̺� �����
CREATE TABLE XX_EMP (
    EMPNO NUMBER,
    ENAME VARCHAR2(100),
    SAL   NUMBER);

-- ���̺� ��ü�� ī���ؼ� �Է��ϴ� ���    
INSERT INTO xx_emp (EMPNO, ENAME, SAL)
SELECT employee_id, first_name, salary 
FROM employees;

-- INSERT�� �����߿� ������ ���� ���
-- 1 �⺻Ű�� �̹� �ִ� (�ߺ���)���� �Է��� ���
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES ( 10, '���ߺ� 10', 100, 1700);
-- 2 FK(�ܷ�Ű)�� �������� ���� ���� �Է�
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES ( 5, '���ߺ� 5', 100, 1);
-- 3 �������� ������ Ʋ����
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES ( 5, '���ߺ� 5', 100, 'D1');
-- 4 �������� ����� ���� ������
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES ( 5, '���ߺ� 5 ���ߺ� 5 ���ߺ� 5 ���ߺ� 5 ���ߺ� 5', 100, 'D1');
DESC departments;
-- ���̺��� ī���ϱ�
CREATE TABLE COPY_DEPT
AS
SELECT * FROM departments;

-- ���� 1
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (271, 'Sample Dept 1', 200, 1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (272, 'Sample Dept 2', 200, 1700);
INSERT INTO departments (department_id, department_name, manager_id, location_id)
VALUES (273, 'Sample Dept 3', 200, 1700);
COMMIT;

-- ���� 2
CREATE TABLE copy_departments (department_id NUMBER(4,0),
                               department_name VARCHAR2(30 byte),
                               manager_id NUMBER(6,0),
                               location_id NUMBER(4,0));
INSERT INTO copy_departments
SELECT *
FROM departments;
COMMIT;