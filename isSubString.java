import java.util.Scanner;

class isSubString
{
	static void compare(String str1,String str2)
	{
		for(int i=0;i<str1.length()-1;i++)
		{
			String ref=str1.substring(i,i+2);
			if(str2.indexOf(ref)!=-1)
			{
				System.out.println("true");
				return;
			}
		}
		System.out.println("false");
	}
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		String str1=in.next();
		String str2=in.next();
	    in.close();
	   if(str1.length()<str2.length())
	   	compare(str1,str2);
	   else
	   	compare(str2,str1);
	}
}