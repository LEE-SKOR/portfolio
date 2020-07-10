package com.test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.view.FriendDAOimpl;

public class ConnectionTest {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "SCOTT";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL,USER,PW)) {
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void detailFriend() {
		FriendDAOimpl dao = new FriendDAOimpl();
		assertEquals("이명박",dao.friendDetail(25).getName()); //프렌드디테일로 25번을 불러오면 getName이 문자열과 같으면 오류가 안생긴다.
	}
}
