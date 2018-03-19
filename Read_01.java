import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Read_01
{
	public static ArrayList<String> call() throws FileNotFoundException
	{
		String ss = "ptt";
		int n = 5;
		String s = "C:\\Users\\wuttinun_r\\Desktop\\stock\\ptt\\" + ss + n + ".txt";
		File f = new File(s);
		Scanner sc = new Scanner(f);
		String s1;
		ArrayList<String> a = new ArrayList<String>();
		while (sc.hasNext())
		{
			s1 = sc.nextLine();
			a.add(s1);
			// System.out.println(s1);
		}
		for (int i = 0; i < a.size(); i++)
		{
			//System.out.println(a.get(i));
		}
		return a;
	}
}
