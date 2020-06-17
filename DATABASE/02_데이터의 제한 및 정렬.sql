-- 1. 테이블의 모든 데이터 가져오기
SELECT * FROM employees;

-- 2. where 절에 가져올 조건에 맞는 행을 선택한다.
-- 위치는 FROM절 다음에 위치
SELECT * 
FROM employees
WHERE department_id = 90; --90번 부서만

SELECT * 
FROM employees
WHERE salary = 24000; --급여가 24000인 직원

/*where 절을 사용할 때 주의점
문자(String)와 날짜(Date) 값은 항상 따옴표(')로 표시
문자값은 대소문자를 구분한다.(Case-Sensitive)
날짜값은 날짜포맷에 벗어나지 않도록(Format-Sensitive)
오라클의 날짜포맷은 RR/MM/DD(RR은 2자리 년도)
*/
-- 3. WHERE + 문자열
SELECT employee_id, first_name, last_name, job_id
FROM  employees
WHERE  first_name = 'Steven';
-- 4. WHERE + 날짜
SELECT SYSDATE FROM DUAL; 
-- DUAL은 샘플테이블 SYSDATE는 현재 날짜 시간

SELECT *
FROM employees
WHERE hire_date >= '03/06/17'; --연/월/일

-- 5. 비교 연산자
SELECT *
FROM employees
WHERE salary >= 10000; --숫자 비교

SELECT *
FROM employees
WHERE hire_date >= '03/06/17'; --날짜 비교

SELECT *
FROM employees
WHERE first_name > 'King'; --문자 비교(알파벳순)

-- 예제 1 employees 테이블에서 employee_id 가 100인 직원 정보를 출력하세요.
SELECT *
FROM employees
WHERE employee_id = 100;

-- 예제 2 employees 테이블에서 first_name이 David인 직원 정보를 출력하세요.
SELECT *
FROM employees
WHERE first_name = 'David';

-- 예제 3 employees 테이블에서 employee_id가 105이하인 직원 정보를 출력하세요.
SELECT *
FROM employees
WHERE employee_id <= 105;

-- 예제 4 jod_history 테이블에서 start_date가 2006년3월3일 이후인 직원 정보를 출력
SELECT *
FROM job_history
WHERE start_date > '06/03/03';

-- 예제 5 department 테이블에서 location_id가 1700이 아닌 모든 부서를 출력하세요.
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

-- 예제 1 employees 테이블에서 salary가 4000을 초과하면서
SELECT *
FROM employees
WHERE salary > 4000 AND job_id = 'IT_PROG';

-- 예제 2
SELECT *
FROM employees
WHERE salary > 4000 AND (job_id = 'IT_PROG' OR job_id = 'FI_ACCOUNT');

-- IN 연산자
SELECT *
FROM employees
WHERE salary = 4000 OR salary =3000 OR salary = 2700;

SELECT *
FROM employees
WHERE salary IN (4000, 3000, 2700);

-- 예제 1
SELECT *
FROM employees
WHERE salary IN (10000, 17000, 24000);

-- 예제 2
SELECT *
FROM employees
WHERE department_id NOT IN (30, 50 ,80 ,100, 110);

-- BETWEEN 연산자
SELECT *
FROM employees
WHERE salary >= 9000 AND salary <= 10000;

SELECT *
FROM employees
WHERE salary BETWEEN 9000 AND 10000;

-- 예제 1
SELECT *
FROM employees
WHERE salary BETWEEN 10000 AND 20000;

-- 예제 2
SELECT *
FROM employees
WHERE hire_date BETWEEN '04/01/01' AND '04/12/30';

-- 예제 3
SELECT *
FROM employees
WHERE salary NOT BETWEEN 7000 AND 17000 ;

/* LIKE 연산자는 _와 %를 사용
%(퍼센트)는 문자가 0개 또는 1개 이상
_(언더바)는 문자가 1개
*/

-- LIKE 연산자
SELECT *
FROM employees
WHERE last_name LIKE 'B%'; -- 대문자 B로 시작하는 이름

SELECT *
FROM employees
WHERE last_name LIKE '%b%'; -- 이름에 b가 있으면 출력

SELECT *
FROM employees
WHERE first_name LIKE '_d%'; --첫글자 뒤에 d가 나오면 출력

SELECT *
FROM employees
WHERE first_name LIKE '__s%'; -- 세번째 문자가 s일때 출력

-- 예제 1
SELECT *
FROM employees
WHERE job_id LIKE '%AD%'; --job_id에 AD를 포함하는 모든 데이터를 조회

-- 예제 2 *
SELECT *
FROM employees
WHERE job_id LIKE '%AD___'; --job_id가 AD를 포함하면서 AD뒤에 따라오는 문자열이 3자리인 데이터를 출력

-- 예제 3
SELECT *
FROM employees
WHERE phone_number LIKE '%1234'; -- 전화번호 뒷자리가 1234로 끝나는 직원정보 출력

-- 예제 4 * 
SELECT *
FROM employees
WHERE phone_number NOT LIKE '%3%' AND phone_number LIKE '%9'; --전화번호에 3일 들어가지 않으면서 전화번호 끝자리가 9로 끝나는 직원정보를 출력

-- 예제 5
SELECT *
FROM employees
WHERE job_id LIKE '%MGR' OR job_id LIKE '%ASST'; --job_id에 MGR을 포함하거나 ASST를 포함하는 직원정보를 출력

--is NULL / is NOT NULL
SELECT *
FROM employees
WHERE commission_pct IS NULL; -- == NULL (X)

SELECT *
FROM employees
WHERE commission_pct IS NOT NULL;

-- 예제 1
SELECT *
FROM employees
WHERE manager_id IS NULL;

-- ORDER BY
SELECT *
FROM employees
ORDER BY salary ; -- ASC 기본이 오름차순

SELECT *
FROM employees
ORDER BY salary DESC; -- 내림차순 (높은것이 위에)

SELECT *
FROM employees
ORDER BY last_name; -- 문자는 알파벳 순으로 정렬

SELECT *
FROM employees
ORDER BY last_name DESC; -- 알파벳 내림차순으로 정렬

-- 멀티정렬
SELECT employee_id, last_name, department_id
FROM employees
ORDER BY department_id, employee_id DESC; --부서번호로 정렬 후 사원번호로 정렬

-- 열을 생성하여 정렬
SELECT employee_id, last_name, salary*12 연봉
FROM employees
ORDER BY 연봉 DESC; --연봉이 큰 순으로 정렬

-- ORDER BY는 WHERE 절 다음에 위치
SELECT employee_id, last_name, salary*12 연봉
FROM employees
WHERE department_id = 90 -- 90번 부서
ORDER BY 연봉 DESC; -- 연봉이 큰 순으로 정렬

-- 예제 1
SELECT employee_id, first_name, last_name
FROM employees
ORDER BY employee_id DESC; -- employee_id 기준 내림차순 정렬

-- 예제 2
SELECT *
FROM employees
WHERE job_id LIKE '%CLERK%'
ORDER BY salary DESC; -- job_id에 CLERK라는 단어가 들어가면서 salary가 높은 직원 순 정렬

-- 예제 3
SELECT employee_id AS "직원번호", first_name AS "직원이름", department_id AS "부서번호", salary AS "월급"
FROM employees
WHERE employee_id BETWEEN 120 AND 150
ORDER BY department_id DESC, salary DESC; -- employee_id 가 120 부터 150번 까지 직원을 부서번호가 큰 순으로 정렬하고 부서번호가 같다면 월급 큰 순으로 정렬

