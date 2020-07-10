package com.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class AddressDAO {
	private static AddressDAO instance = new AddressDAO();
	
	public static AddressDAO getInstance() {
		return instance;
	}

	//DB연결
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/jsp");
		return ds.getConnection();
	}
	
	//추가
	public void addrInsert(Address ad) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql = "INSERT INTO address VALUES (address_seq.nextval,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,ad.getName());
			ps.setString(2,ad.getZipcode());
			ps.setString(3,ad.getAddr());
			ps.setString(4,ad.getTel());
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,ps);
		}
	}
	//수정
	public void addrUpdate(Address ad) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = getConnection();
			String sql = "UPDATE address SET name=?, zipcode=?, addr=?, tel=? WHERE num=? ";
			ps = con.prepareStatement(sql);
			ps.setString(1,ad.getName());
			ps.setString(2,ad.getZipcode());
			ps.setString(3,ad.getAddr());
			ps.setString(4,ad.getTel());
			ps.setLong(5,ad.getNum());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,ps);
		}
	}
	
	//전체보기
	public ArrayList<Address> addrList(){
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		 ArrayList<Address> arr = new ArrayList<Address>();
		 
		 try {
			 con = getConnection();
			 String sql = "SELECT * FROM address";
			 st = con.createStatement();
			 rs = st.executeQuery(sql);
			 while(rs.next()) {
				 Address ad = new Address();
				 ad.setAddr(rs.getString("addr"));
				 ad.setName(rs.getString("name"));
				 ad.setNum(rs.getLong("num"));
				 ad.setTel(rs.getString("tel"));
				 ad.setZipcode(rs.getString("zipcode"));
				 arr.add(ad);
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 closeConnection(con,st,rs);
		 }
		return arr;
	}
	
	//상세보기
	public Address addrDetail(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Address ad = null;
		
		try {
			con = getConnection();
			String sql = "SELECT * FROM address WHERE num =+"+num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				ad = new Address();
				ad.setAddr(rs.getString("addr"));
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getLong("num"));
				ad.setTel(rs.getString("tel"));
				ad.setZipcode(rs.getString("zipcode"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con, st, rs);
		}
		return ad;
	}

	//삭제
	
	//닫기
	private void closeConnection(Connection con, PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
		private void closeConnection(Connection con, Statement st, ResultSet rs) {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}
}
