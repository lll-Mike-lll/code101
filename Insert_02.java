import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Insert_02
{
	private static Connection conn = null;
	private static Statement st = null;

	public static void main(String[] args) throws FileNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a = Read_01.call();
		System.out.println(a.get(1));
		String url = "jdbc:mysql://localhost/test";
		String user = "root";
		String pass = "";
		conn = (Connection) DriverManager.getConnection(url, user, pass);
		for (int i = 20; i < 40; i++)
		{
			System.out.println(a.get(i));
		}
		for (int i = 1; i <= a.size(); i++)
		{
			call(i, a.get(i - 1));
		}
		System.out.println(a.size());
	}

	public static void call(int i, String ss) throws SQLException
	{

		// st = (Statement) conn.createStatement();
		String sql = "INSERT INTO ptt(id,date,open,close) VALUES(3,'ptt','ptt','ptt')";
		String sql2 = "UPDATE ptt " + "SET close = 'xxx' WHERE id = 2";
		String sql3 = "INSERT INTO ooo4(no,date,open,close,max,min,vol,val) VALUES(" + i + ",'" + ss
				+ "','ptt','ptt','ptt','ptt','ptt','ptt')";
		try
		{
			st = (Statement) conn.createStatement();
			
			st.executeUpdate(sql3);
			// st.close();
			System.out.println("success 3");
			st.close();

		} catch (

		Exception e)
		{
			// TODO: handle exception
		}
	}

}
