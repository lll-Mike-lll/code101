import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Test_01
{

	public static void main(String[] args) throws FileNotFoundException
	{
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a = Read_01.call();
		for (int i = 0; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println(a.size());
	}

}
