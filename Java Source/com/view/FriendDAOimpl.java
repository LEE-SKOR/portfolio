package com.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Friend;
import com.model.FriendDAO;

public class FriendDAOimpl implements FriendDAO{
	String url,user,pwd;
	//생성자 -> 디비연결
	public FriendDAOimpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			url = "jdbc:oracle:thin:@localhost:1521:xe";
			user = "scott";
			pwd = "1234";
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void friendInsert(Friend f) {
		Connection con = null;
		PreparedStatement ps = null;
	
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql ="insert into friend "
					+ " values(friend_seq.nextval,?,?,?,?)";
			
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

	public ArrayList<Friend> friendView() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Friend> arr = new ArrayList<Friend>();
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			String sql = "SELECT * FROM friend ORDER BY num DESC";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Friend f = new Friend();
				f.setName(rs.getString("name"));
				f.setBirth(rs.getString("birth"));
				f.setPhone(rs.getString("phone"));
				f.setAddr(rs.getString("addr"));
				f.setNum(rs.getInt("num"));
				arr.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,st,rs);
		}
		return arr;
	}

	public Friend friendDetail(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Friend f = null;
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			String sql = "SELECT * FROM friend WHERE num ="+num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				f = new Friend();
				f.setBirth(rs.getString("birth"));
				f.setPhone(rs.getString("phone"));
				f.setAddr(rs.getString("addr"));
				f.setName(rs.getString("name"));
				f.setNum(rs.getInt("num"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			closeConnection(con,st,rs);
		}
		return f;
		
	}

	public void friendUpdate(Friend f) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			String sql = "UPDATE friend SET name =?,birth=?,phone=?,addr=? where num=?";
			con = DriverManager.getConnection(url, user, pwd);
			ps = con.prepareStatement(sql);
			ps.setString(1,f.getName());
			ps.setString(2,f.getBirth());
			ps.setString(3,f.getPhone());
			ps.setString(4,f.getAddr());
			ps.setInt(5,f.getNum());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void friendDelete(int num) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		
		try {
			con = DriverManager.getConnection(url,user,pwd);
			String sql = "DELETE FROM friend WHERE num =" + num;
			st = con.createStatement();
			st.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, st,null);
		}
	}

	public ArrayList<Friend> friendSearch(String key, String word) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Friend> arr = new ArrayList<Friend>();
		
		try {
		con = DriverManager.getConnection(url,user,pwd);
		st = con.createStatement();
		String sql = "SELECT * FROM friend WHERE "+key+" LIKE '%"+word+"%'";
		System.out.println(sql);
		rs = st.executeQuery(sql);
		while(rs.next()) {
				Friend f = new Friend();
				f.setBirth(rs.getString("birth"));
				f.setName(rs.getString("name"));
				f.setPhone(rs.getString("phone"));
				f.setAddr(rs.getString("addr"));
				f.setNum(rs.getInt("num"));
				arr.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,st,rs);
		}
		return arr;
	}
	public void closeConnection(Connection con,PreparedStatement ps) {
		try {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
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
}
