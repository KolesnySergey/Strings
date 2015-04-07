import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MyStrings 
{
	public static void main(String[] args)
	{
		HashSet<String> strArray = new HashSet<String>();
		strArray.add("строка 1");
		strArray.add("строка 2");
		strArray.add("строка 3");
		strArray.add("строка 4");
		strArray.add("строка 5");
		strArray.add("строка 1");
	
		
		for (String str : strArray) 
		{
			System.out.println(str);
		}
		
		ArrayList<MyCls> newArray = new ArrayList<MyCls>();
		for (int i = 0; i < 4; i++) {
			newArray.add(new MyCls(i,"строка #"+i));
		}
		
		for (MyCls myCls : newArray) {
			System.out.println(myCls.toString());
		}
		
		/**проверяем, дублируются ли элементы*/
		MyCls newCls = new MyCls(0, "строка #0");
		newCls.toString();
		
		System.out.write(1);
	}
	
	
}

class MyCls 
{
	int digit = 0;
	String str = "";
	public MyCls(int digit, String str) 
	{
		this.digit = digit;
		this.str = str;
	}
	
	@Override
	public String toString()
	{
		return "digit = " + digit + "\t str = " + str; 
	}
}