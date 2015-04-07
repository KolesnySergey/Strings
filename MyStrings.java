import java.util.ArrayList;

public class MyStrings 
{
	public static void main(String[] args)
	{
		String[] strArray = new String[]
							{
								"������ 1",
								"������ 2",
								"������ 3",
								"������ 4",
								"������ 5"
							};
		
		for (String str : strArray) 
		{
			System.out.println(str);
		}
		
		ArrayList<MyCls> newArray = new ArrayList<MyCls>();
		for (int i = 0; i < 4; i++) {
			newArray.add(new MyCls(i,"������ #"+i));
		}
		
		for (MyCls myCls : newArray) {
			System.out.println(myCls.toString());
		}
		
		/**��������, ����������� �� �������� � ���������� ����������*/
		MyCls newCls = new MyCls(0, "������ #0");
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