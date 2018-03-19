import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Create_T_01
{
	private static Connection conn = null;
	private static Statement st = null;

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		String table = "ooo4";
		String url = "jdbc:mysql://localhost/test";
		String user = "root";
		String pass = "";
		conn = (Connection) DriverManager.getConnection(url, user, pass);
		st = (Statement) conn.createStatement();
		System.out.println("success1");
		String sql = "CREATE TABLE " + table + " " + "(no INTEGER not NULL, " + " date TEXT, " + " open TEXT, "
				+ " close TEXT, " + " max TEXT, " + " min TEXT, " + " vol TEXT, " + " val TEXT, "
				+ " PRIMARY KEY ( no ))";

		try
		{
			st.execute(sql);
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}

}
