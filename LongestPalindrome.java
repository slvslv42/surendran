import java.util.Scanner;
class LongestPalindrome {
	
	String result;
	static int l=0;
	
	void isPalindrome(String ref)
	{
		String rev=new StringBuffer(ref).reverse().toString();
		if(ref.equals(rev))
		{
			if(ref.length()>l)
			{
				result=ref;
				l=ref.length();
			}
		}
	}
	
	public static void main(String[] arg)
	{
		LongestPalindrome obj=new LongestPalindrome();
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		
		for(int i=0;i<str.length();i++)
		{
			boolean condition=true;
			int id=0;
			char x=str.charAt(i);
			int j=1;
			while(condition)
			{
				id=str.indexOf(x,i+j);
				if(id==-1)
					condition=false;
				else{
					obj.isPalindrome(str.substring(i, id+1));
					j+=(id+1);
				}
			}
		}
		System.out.println(obj.result);
	}
	
}
