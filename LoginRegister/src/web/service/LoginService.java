package web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import web.entity.Member;

public class LoginService {
	public static boolean Login(Member member) throws SQLException, ClassNotFoundException
	{
		boolean answer = false;
		String url = "jdbc:oracle:thin:@localhost:1521/xepdb1";
		String sql = "select * from member where id=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"USER_LOGIN","USER_LOGIN");
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, member.getId());
		ResultSet rs = pst.executeQuery();
		
		rs.next();
		
		String id_ = rs.getString("id");
		String pwd_ = rs.getString("pwd");
		
		if(member.getId().equals(id_) && member.getPwd().equals(pwd_))
		{
			// 로그인 성공
			answer = true;
		}
		
		rs.close();
		pst.close();
		con.close();
		
		return answer;
		
	}
}
