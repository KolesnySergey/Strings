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
		
		HashSet<MyCls> newArray = new HashSet<MyCls>();
		for (int i = 0; i < 4; i++) {
			newArray.add(new MyCls(i,"строка #"+i));
		}
		
		for (MyCls myCls : newArray) {
			System.out.println(myCls.toString());
		}
		
		/**проверяем, дублируются ли элементы*/
		newArray.add(new MyCls(0, "строка #0"));
		
		System.out.println("Проверка на дублирование: ");
		for (MyCls myCls : newArray) {
			System.out.println(myCls.toString());
		}
		
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
	
	@Override
	public boolean equals(Object obj){
        if (!(obj instanceof MyCls))
            return false;
        MyCls myClass = (MyCls)obj;
        return digit == myClass.digit && str.equals(myClass.str);
    }

    public int hashCode(){
        int hash = 22;
        hash = hash*17 + str.hashCode();
        hash = hash*17 + digit;
        return hash;
    }
	
}