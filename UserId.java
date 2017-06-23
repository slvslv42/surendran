import java.util.Scanner;

public class UserId {
	
	String small;
	String large;
	
	static char toogle(char x)
	{
		if(Character.isLowerCase(x))
			return Character.toUpperCase(x);
		else
			return Character.toLowerCase(x);
	}
	
	public static void main(String[] args)
	{
		UserId obj=new UserId();
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
		String pin=in.next();
		int n=in.nextInt();
		in.close();
		if(str1.length()>str2.length())
		{
			obj.small=str2;
			obj.large=str1;
		}
		else
		{
			if(str1.length()<str2.length())
			{
				obj.small=str1;
				obj.large=str2;
			}
			else
			{
				if(str1.compareTo(str2)>0)
				{
					obj.small=str2;
					obj.large=str1;
				}
				else
				{
					obj.small=str1;
					obj.large=str2;
				}
			}
		}
		StringBuffer id=new StringBuffer();
		id.append(toogle(obj.large.charAt(0)));
		for(int i=0;i<obj.small.length();i++)
		{
			id.append(toogle(obj.small.charAt(i)));
		}
		id.append(pin.charAt(n-1));
		id.append(pin.charAt(pin.length()-n));
		System.out.println(id);
	}
}
