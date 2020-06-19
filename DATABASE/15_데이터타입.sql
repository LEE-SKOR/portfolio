-- 문자형
-- 문자형 CHAR 와 VARCHAR2 비교
CREATE TABLE comp(
    char_col    CHAR(4),
    varchar_col VARCHAR(4)
);
INSERT INTO comp VALUES ('AA', 'AA');
INSERT INTO comp VALUES ('AAA', 'AAA');
INSERT INTO comp VALUES ('AAAA', 'AAAA');
COMMIT;

SELECT * FROM comp;

SELECT * FROM comp
WHERE char_col = varchar_col;
-- char는 고정길이 데이터 타입, varchar2는 가변길이 데이터 타입
-- char는 지정된 길이보다 작은 데이터 입력될 시 나머지 공간 공백으로 채워지고,
-- varchar2는 지정된 길이보다 작은 데이터 입력될 시 나머지 공간은 채우지 않는다.

-- 숫자형 데이터 타임 NUMBER
-- NUMBER(p,s) : p는 유효자리수 1~38, s는 소수점 유효자리수

-- DATE 타입
SELECT hire_date, to_char(hire_date, 'YYYY-MM-DD') "날짜 => 문자변환"
FROM employees;

SELECT *
FROM employees
WHERE hire_date < '2002-03-03';
-- 오라클이 자동을 ㅗ오른쪽 문자를 좌측 데이터 날짜형에 맞게 형변환 하여 비교