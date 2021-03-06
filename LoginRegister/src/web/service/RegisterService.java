package web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.entity.Member;

public class RegisterService {
	public static boolean Register(Member member) throws SQLException, ClassNotFoundException
	{
		Connection con = null;
		PreparedStatement pst = null;
		boolean answer = false;
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
			String sql = "insert into member(ID, PWD) values(?,?)";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"USER_LOGIN","USER_LOGIN");
			pst = con.prepareStatement(sql);
			pst.setString(1, member.getId());
			pst.setString(2, member.getPwd());
			int result = pst.executeUpdate();
			
			if(result!=0)	// 회원가입 실패
			{
				answer = true; 
			}	
		}catch(SQLException e) {
			System.out.println("회원가입 실패");
			e.printStackTrace();
		}finally {
			pst.close();
			con.close();
		}
		
		return answer;
		
	}
}
