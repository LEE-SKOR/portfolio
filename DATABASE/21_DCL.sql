-- DCL : DATA CONTROL LANGUAGE ������ ���� ���
-- �������� �������� ����
-- GRANT : Ư�� ����ڿ��� ��������� �ο�
-- REVOKE : Ư�� ����ڿ��� ��������� ȸ�� �� ��Ż

-- �� ���� �����
CREATE USER John IDENTIFIED by 1234; -- ������ ���� ����� ��й�ȣ 1234
-- �����ͺ��̽� ���ӱ��� �ο�
GRANT CREATE SESSION TO John; -- John �������� ���ӱ��� �ο�
-- ���̺� ���� ���� �ο�
GRANT CREATE TABLE TO John; -- John���� ���̺� �������� �ο�
-- ���̺� �����̽� (���̺��� ������ �� �ִ� ����)
CREATE TABLESPACE johnspace
DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\john.dbf' SIZE 10M
AUTOEXTEND ON NEXT 5M;
-- johnspace��� ���̺�������� ����
-- ������ ��� ����, ���� ������� 10MB
-- �ڵ����� ���̺� ������ �����ϸ� 5MB�� �߰�

-- �� ������ �� ���̺����̽��� ����� �� �ֵ���
ALTER USER John DEFAULT TABLESPACE johnspace; -- ����Ʈ �������̽���
ALTER USER John QUOTA UNLIMITED ON johnspace; -- ���̺����̽� ������

-- ��(role) �ο�
GRANT CONNECT RESOURCE TO John;
-- Connect ���� ���Ӱ��� ���ѵ��� ����
-- Resource ���� ������ü�� (���̺�,���) �� ���� �� ��� ����

-- ������ ���� �� ȸ�� REVOKE + ���� + FROM + ����
REVOKE CREATE TABLE FROM John;

-- ���� ���� �� ȸ��
REVOKE RESOURCE FROM John;

-- John ������ ����
DROP USER John CASCADE;
-- ���̺����̽� ����
DROP TABLESPACE johnspace;

-- ���� �����Ǿ� �ִ� ���� Ȯ��
SELECT * FROM ALL_USERS;
SELECT * FROM DBA_USERS;

-- ����ڿ� �ο��� �ý��� ���� Ȯ��
SELECT * FROM DBA_SYS_PRIVS
WHERE GRANTEE = 'HR';

