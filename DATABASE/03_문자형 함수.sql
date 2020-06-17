-- 문자형 함수는 대소문자 함수와 문자 조작함수로 나뉜다.

-- 1. 대소문자 조작 함수 (upper, lowerm inticap)
SELECT 1+1
FROM DUAL; -- 듀얼테이블은 연습용 테이블

SELECT LOWER('SQL COURSE'), UPPER('sql course'), INITCAP ('SQL COURSE')
FROM DUAL;

-- 문자함수를 where절에 사용
SELECT employee_id, first_name
FROM employees
WHERE UPPER(first_name) = 'PATRICK';

-- 2. 문자 조작함수
-- CONCAT (문자열을 합침)
SELECT first_name, last_name, CONCAT(first_name, last_name) AS "풀네임"
FROM employees;

-- SUBSTR (열 이름, m, n) : m은 시작문자, n은 잘라낼 길이
SELECT employee_id,first_name,
SUBSTR(first_name, 1, 3), -- 첫번째부터 세번째까지
SUBSTR(first_name, 2, 4), -- 두번째부터 네번째까지
SUBSTR(first_name, 2), -- 두번째부터 끝까지
SUBSTR(first_name, -3) -- 끝에서부터 세글자 (음수일때 끝에서부터 카운트)
FROM employees;

-- LENGTH (문자열의 길이를 알려준다.(리턴))
SELECT first_name, LENGTH(first_name)
FROM employees;

-- INSTR(문자열, 찾을 문자, m, n)
-- m은 검사 시작 위치
-- n은 찾을 횟수
-- 디폴트값은 m,n 각각 1
SELECT first_name,
INSTR(first_name, 'e', 2), -- 두번째 문자부터 e를 검색
INSTR(first_name, 'e', 5), -- 다섯번째 문자부터 e를 검색
INSTR(first_name, 'e', 1, 2) -- 첫번째 문자부터 두번째 e를 검색
FROM employees
where first_name = 'Nanette';

--LPAD / RPAD (문자열, 자릿수, 채울문자)
SELECT employee_id, first_name, salary,
    LPAD(salary,10,'#'), -- 좌측에 우물정 + 문자가 10자리가 되도록
    RPAD(salary,10,'#') -- 우측에 우물정 + 문자가 10자리가 되도록
FROM employees;

-- 공백을 이용해서 문자열을 분리
SELECT 
'홍 길동' 성명,
SUBSTR('홍홍 길동',1,INSTR('홍홍 길동',' ')-1) 성,
SUBSTR('홍홍 길동',INSTR('홍홍 길동',' ')+1) 이름
FROM DUAL;

-- 문자형 함수 예제
SELECT last_name, CONCAT('직업명이 ', job_id) AS "직업명"
FROM employees
WHERE SUBSTR(job_id, 4, 3) = 'REP'; -- job_id의 4번째 문자부터 REP인 경우

SELECT employee_id,
    CONCAT(first_name, last_name) 전체이름,
    last_name,
    LENGTH(last_name) 길이,
    INSTR(last_name, 'a') "'a'가 몇번째?"
FROM employees;

SELECT first_name, last_name,
    UPPER(CONCAT(first_name, SUBSTR(last_name, 1,3))) 이름합성
FROM employees
WHERE department_id = 60;

-- 문자 치환 : REPLACE
SELECT job_id, REPLACE(job_id, 'ACCOUNT', 'ACCNT') 적용
FROM employees
WHERE job_id LIKE '%ACCOUNT%';

-- 예제 1
SELECT last_name 이름, LOWER(last_name),UPPER (last_name), email, INITCAP(email) 
FROM employees
ORDER BY last_name ;

-- 예제 2
SELECT job_id, SUBSTR(job_id,1, 2)
FROM employees;