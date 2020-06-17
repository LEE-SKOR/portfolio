-- 조인
SELECT e.employee_id, d.department_id, d.department_name
FROM employees e 
JOIN departments d
ON e.department_id = d.department_id;

-- NATURAL 조인 : ON절 생략
SELECT employee_id, first_name,
        job_id, job_title
FROM employees e
NATURAL JOIN jobs j;

-- 기본 동등조인
SELECT e.employee_id, j.job_id, j.job_title
FROM employees e
JOIN jobs j
    ON e.job_id = j.job_id;

-- WHERE절 추가
SELECT e.employee_id, e.department_id, d.department_name
FROM employees e
JOIN departments d
    ON e.department_id = d.department_id
WHERE d.department_id = 50;

-- 3개의 테이블 조인
SELECT e.employee_id, d.department_name, lo.city
FROM employees e
JOIN departments d ON e.department_id = d.department_id
JOIN locations lo ON d.location_id = lo.location_id;

-- 예제 1
SELECT d.department_name 부서명, l.city 도시명, c.country_name 국가명
FROM departments d
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
WHERE (l.city = 'London' OR l.city = 'Seattle')
        AND c.country_name LIKE 'United%'
ORDER BY 2;

-- 자체조인
SELECT e.last_name 직원,e.employee_id 직원번호,
        m.last_name 매니저, m.employee_id 직원번호2
FROM employees e
JOIN employees m
    ON e.manager_id = m.employee_id;
    
SELECT employee_id, last_name,manager_id
FROM employees
WHERE last_name = 'Kumar';

