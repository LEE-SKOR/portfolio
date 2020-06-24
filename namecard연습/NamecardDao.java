package com.oracle.namecard;

import java.sql.*;
import java.util.ArrayList;

public class NamecardDao {
    static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";  
    static final String USER = "scott";
    static final String PASSWORD = "1234";
    
    public NamecardDao() {
        try { // ����Ŭ DB ����̹� �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private Connection getConnection() throws SQLException {
    	// DB ������ �޼ҵ�� �����
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    		//���� ResultSet �� �ΰ��� �ƴϸ� ����, ���� Statement ����, ���������� Ŀ�ؼ� ����
    private void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    // �Է� �޼ҵ�
    public void insert(Namecard card) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO namecard VALUES (CARD_NO.NEXTVAL, ?, ?, ?, ?)";

        try {
            con = getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, card.getName());
            pstmt.setString(2, card.getMobile());
            pstmt.setString(3, card.getEmail());
            pstmt.setString(4, card.getCompany());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(sql);
        } finally {
            close(null, pstmt, con);
        }
    }
    
    //��ȣ no �� ����    
    public void delete(int no) {
       //�ۼ��ϱ�
    }
    
    //��ȣ no �� �˻�
    public Namecard selectOne(int no) {
       //�ۼ��ϱ�
        return null;
    }
    
    //�̸����� ã��
    public ArrayList<Namecard> selectByKeyword(String keyword) {       
        ArrayList<Namecard> matched = new ArrayList<Namecard>();
        // �ۼ��ϱ�  
        return matched;
    }
    
    //Namecard�� ��� ��/���� �������� ��ȣ������ 
    public ArrayList<Namecard> selectAll() {
        ArrayList<Namecard> all = new ArrayList<Namecard>();
        // �ۼ��ϱ�
        return all; 
    }        
    
    //�����ϱ�
    public void update(Namecard card) {
    	//�ۼ��ϱ�
    }

}
