-- 그룹함수

SELECT COUNT(*) --COUNT 행의 갯수 출력
FROM employees;

SELECT salary
FROM employees
ORDER BY salary DESC;

-- MAX MIN
SELECT MAX(salary), MIN(salary)
FROM employees;

-- 문자열에 적용
SELECT MAX(first_name), MIN(first_name)
FROM employees;

-- 날짜에 적용
SELECT MAX(hire_date), MIN(hire_date)
FROM employees;

-- SUM, AVG : 합계와 평균 (숫자만 가능)
SELECT SUM(salary), AVG(salary)
FROM employees;

-- COUNT
SELECT COUNT(*) --직원테이블의 모든행의 갯수
FROM employees;

SELECT COUNT(NVL(commission_pct,0))
FROM employees;

SELECT COUNT(department_id) 
FROM employees;

SELECT COUNT(DISTINCT department_id) --부서의 갯수 
FROM employees;

-- 90번 부서의 직원의 수
SELECT COUNT(employee_id) 
FROM employees
WHERE department_id =  90;

SELECT AVG(commission_pct) --NULL값을 제외한 평균
FROM employees;

-- GROUP BY 로 나눠서 집계함수 사용
SELECT department_id 부서번호, ROUND(AVG(salary)) 평균급여, 
       TO_CHAR(ROUND(AVG(salary)), '$99,999') 달러표시
FROM employees
GROUP BY department_id;


SELECT department_id 부서번호,
        ROUND(AVG(salary)) 평균급여,
        SUM(salary) 총급여합계,
        COUNT(*) 부서인원수
FROM employees
GROUP BY department_id;


SELECT department_id 부서번호, job_id 직무,
        ROUND(AVG(salary)) 평균급여,
        SUM(salary) 총급여합계,
        COUNT(*) "부서별 직무별 인원수"
FROM employees
GROUP BY department_id, job_id;

-- 예제 1
SELECT department_id 부서명, COUNT(*) 사원수,
        MAX(salary) 최고급여, MIN(salary) 최소급여,
        SUM (salary) 급여합계, ROUND (AVG (salary)) 평균급여
FROM employees
GROUP BY department_id
ORDER BY 급여합계 DESC;

-- 예제 2
SELECT department_id 부서번호, job_id 직업, manager_id 상사번호, SUM(salary) 급여합계, COUNT(*) 직원수
FROM employees
GROUP BY department_id, job_id, manager_id
ORDER BY department_id;


-- 예제 3
SELECT ROUND(AVG(MAX(salary))) 부서별최고월급평균, ROUND(AVG(MIN(salary))) 부서별최저월급평균
FROM employees
GROUP BY department_id;

-- HAVING 절 : 그룹함수를 이용한 조건절
SELECT department_id 부서번호, SUM(salary) 급여합계
FROM employees
WHERE SUM(salary) >  100000 -- 그룹함수 사용
GROUP BY department_id
ORDER BY department_id;

SELECT department_id 부서번호, COUNT(*) 직원수, SUM(salary) 급여합계
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 5;


-- 예제 1
SELECT job_id 직종, SUM(salary) 월급여합계
FROM employees
WHERE job_id != 'AC_MGR'        -- 일반조건
GROUP BY job_id
HAVING AVG(salary) > 10000      -- 그룹함수 조건
ORDER BY 월급여합계 DESC;

-- 예제 2
SELECT department_id 부서번호, ROUND(AVG(salary)) 평균급여
FROM employees
WHERE department_id != 40
GROUP BY department_id
HAVING AVG(salary) <= 7000;

-- 예제 3
SELECT job_id, SUM(salary) 급여총액
FROM employees
WHERE job_id NOT LIKE '%REP%'
GROUP BY job_id
HAVING SUM(salary) >= 13000
ORDER BY 급여총액 DESC;