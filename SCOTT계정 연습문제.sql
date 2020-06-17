-- �������� 1
SELECT empno, ename, sal
FROM emp
WHERE deptno = 10;

-- �������� 2
SELECT ename, hiredate, deptno
FROM emp
WHERE empno = 7369;

-- �������� 3
SELECT *
FROM emp
WHERE ename = 'ALLEN';

-- �������� 4
SELECT ename, deptno, sal
FROM emp
WHERE hiredate = '81/02/20';

-- �������� 5
SELECT *
FROM emp
WHERE job != 'MANAGER';

-- �������� 6
SELECT *
FROM emp
WHERE hiredate >= '81/04/02';

-- �������� 7
SELECT ename, sal, deptno
FROM emp
WHERE sal >= 800;

-- �������� 8
SELECT *
FROM emp
WHERE deptno >= 20;

-- �������� 9
SELECT *
FROM emp
WHERE ename >= 'L';

-- �������� 10
SELECT *
FROM emp
WHERE hiredate < '81/12/09';

-- �������� 11
SELECT empno, ename
FROM emp
WHERE empno <= 7698;

-- �������� 12
SELECT ename, sal, deptno
FROM emp
WHERE hiredate >= '81/04/02' AND hiredate <= '82/12/09';

-- �������� 13
SELECT ename, job, sal
FROM emp
WHERE sal > 1600 AND sal < 3000; 

-- �������� 14
SELECT *
FROM emp
WHERE empno NOT BETWEEN 7654 AND 7782;

-- �������� 15
SELECT *
FROM emp
WHERE ename BETWEEN 'B' AND 'J';

-- �������� 16
SELECT *
FROM emp
WHERE hiredate NOT LIKE '%81%';

SELECT *
FROM emp
WHERE TO_CHAR(hiredate, 'YYYY') <> '1981';

-- �������� 17
SELECT *
FROM emp
WHERE job IN ('MANAGER', 'SALESMAN');

-- �������� 18
SELECT ename, empno, deptno
FROM emp
WHERE deptno NOT IN (20,30);

-- �������� 19
SELECT empno, ename, hiredate, deptno
FROM emp
WHERE ename LIKE 'S%';

-- �������� 20
SELECT *
FROM emp
WHERE hiredate LIKE '81%';

-- �������� 21
SELECT *
FROM emp
WHERE ename LIKE '%S%';

-- �������� 22
SELECT *
FROM emp
WHERE ename LIKE 'M____N';

-- �������� 23
SELECT * 
FROM emp
WHERE ename LIKE '_A%';

-- �������� 24
SELECT *
FROM emp
WHERE comm IS NULL;

-- �������� 25
SELECT *
FROM emp
WHERE comm IS NOT NULL;

-- �������� 26
SELECT ename, deptno, sal
FROM emp
WHERE deptno = 30 AND sal >= 1500;

-- �������� 27
SELECT empno, ename, deptno
FROM emp
WHERE ename LIKE 'K%' OR deptno = 30;

-- �������� 28
SELECT *
FROM emp
WHERE sal > 1500 AND deptno = 30 AND job = 'MANAGER';

-- �������� 29
SELECT *
FROM emp
WHERE deptno = 30
ORDER BY deptno DESC;

-- �������� 30
SELECT *
FROM emp
ORDER BY sal DESC;

-- �������� 31
SELECT *
FROM emp
ORDER BY deptno, sal DESC;

-- �������� 32
SELECT deptno, ename, sal
FROM emp
ORDER BY deptno DESC, ename ASC, sal DESC;

-- �������� 33
SELECT ename, sal, ROUND (sal*0.13) bonus, deptno
FROM emp
WHERE deptno = 10;

-- �������� 34
SELECT ename, sal, NVL(comm,0), sal+NVL(comm,0) total
FROM emp
ORDER BY total DESC;

-- �������� 35
SELECT ename, sal, TO_CHAR (ROUND (sal*0.15,1), '$999,999.9') ȸ��
FROM emp
WHERE sal BETWEEN 1500 AND 3000;

-- �������� 36
SELECT count(*)
FROM emp
--JOIN dept d ON d.dname = e.dname
--GROUP BY dname;

-- �������� 37