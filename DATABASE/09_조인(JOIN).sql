-- ����
SELECT e.employee_id, d.department_id, d.department_name
FROM employees e 
JOIN departments d
ON e.department_id = d.department_id;

-- NATURAL ���� : ON�� ����
SELECT employee_id, first_name,
        job_id, job_title
FROM employees e
NATURAL JOIN jobs j;

-- �⺻ ��������
SELECT e.employee_id, j.job_id, j.job_title
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;

-- WHERE�� �߰�
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 50;

-- 3���� ���̺� ����
SELECT e.employee_id, d.department_name, lo.city
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations lo ON d.location_id = lo.location_id;

-- ���� 1
SELECT d.department_name �μ���, l.city ���ø�, c.country_name ������
FROM departments d
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
WHERE (l.city = 'London' OR l.city = 'Seattle')
        AND c.country_name LIKE 'United%'
ORDER BY 2;

-- ��ü����
SELECT e.last_name ����,e.employee_id ������ȣ,
        m.last_name �Ŵ���, m.employee_id ������ȣ2
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id;
    
SELECT employee_id, last_name,manager_id
FROM employees
WHERE last_name = 'Kumar';

