package com.oracle.namecard;

import java.sql.*;
import java.util.ArrayList;

public class NamecardDao {
    static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";  
    static final String USER = "scott";
    static final String PASSWORD = "1234";
    
    public NamecardDao() {
        try { // 오라클 DB 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    private Connection getConnection() throws SQLException {
    	// DB 연결을 메소드로 만들기
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    		//먼저 ResultSet 이 널값이 아니면 종료, 다음 Statement 종료, 마지막으로 커넥션 종료
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
    // 입력 메소드
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
    
    //번호 no 행 삭제    
    public void delete(int no) {
       //작성하기
    }
    
    //번호 no 행 검색
    public Namecard selectOne(int no) {
       //작성하기
        return null;
    }
    
    //이름으로 찾기
    public ArrayList<Namecard> selectByKeyword(String keyword) {       
        ArrayList<Namecard> matched = new ArrayList<Namecard>();
        // 작성하기  
        return matched;
    }
    
    //Namecard의 모든 행/열을 가져오기 번호순으로 
    public ArrayList<Namecard> selectAll() {
        ArrayList<Namecard> all = new ArrayList<Namecard>();
        // 작성하기
        return all; 
    }        
    
    //수정하기
    public void update(Namecard card) {
    	//작성하기
    }

}
