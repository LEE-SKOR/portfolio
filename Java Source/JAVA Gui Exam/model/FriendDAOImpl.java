package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FriendDAOImpl implements FriendDAO{
	String url,user,pwd;
	//생성자->DB연결
	public FriendDAOImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			user = "scott";
			pwd = "1234";
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void friendInsert(Friend f) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql ="INSERT INTO friend VALUES(friend_seq.nextval,?,?,?,?)";
			ps= con.prepareStatement(sql);
			ps.setString(1, f.getName());
			ps.setString(2, f.getBirth());
			ps.setString(3, f.getPhone());
			ps.setString(4, f.getAddr());

			ps.executeUpdate();
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			closeConnection(con,ps);
		}
	}

	@Override
	public ArrayList<Friend> friendView() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Friend> arr = new ArrayList<Friend>();
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			String sql = "SELECT * FROM player ORDER BY num DESC";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Friend p = new Friend();
				p.setNum(rs.getInt("num"));
				p.setName(rs.getString("name"));
				p.setBirth(rs.getString("birth"));
				p.setAddr(rs.getString("addr"));

				arr.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,st,rs);
		}
		return arr;
	}
	
	@Override
	public Friend friendDetail(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void friendUpdate(Friend f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void friendDelete(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Friend> friendSearch(String key, String word) {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeConnection(Connection con, Statement st, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(st!=null)st.close();
			if(con!=null)con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void closeConnection(Connection con,PreparedStatement ps) {
		try {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}