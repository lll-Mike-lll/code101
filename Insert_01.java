import java.net.ConnectException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Insert_01
{
	private static Connection conn = null;
	private static Statement st = null;

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost/test";
		String user = "root";
		String pass = "";

		conn = (Connection) DriverManager.getConnection(url, user, pass);
		st = (Statement) conn.createStatement();
		System.out.println("success1");
		String sql = "INSERT INTO ptt(id,date,open,close) VALUES(3,'ptt','ptt','ptt')";
		String sql2 = "UPDATE ptt " + "SET close = 'xxx' WHERE id = 2";
		try
		{
			// st.execute(sql);
			st.execute(sql2);
			System.out.println("success2");
			// st.executeUpdate(sql2);
		} catch (Exception e)
		{
			// TODO: handle exception
		}

	}

}
