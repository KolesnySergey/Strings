import java.util.ArrayList;

public class MyStrings 
{
	public static void main(String[] args)
	{
		String[] strArray = new String[]
							{
								"строка 1",
								"строка 2",
								"строка 3",
								"строка 4",
								"строка 5"
							};
		
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
		
		/**проверим, дублируются ли элементы с одинаковым содержимым*/
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
	
	public String toString()
	{
		return "digit = " + digit + "\t str = " + str; 
	}
}