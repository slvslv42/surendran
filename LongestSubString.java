import java.util.Scanner;
class LongestSubString {
	
	String result;
	static int l=0;
	
	void isLong(String ref)
	{
		int f=0;
		for(int i=0;i<ref.length();i++)
		{
			int c=0;
			char x=ref.charAt(i);
			for(int j=i+1;j<ref.length();j++)
			{
				if(x==ref.charAt(j))
					c++;
			}
			if(c==0)
				f++;
		}
		if(f==ref.length())
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
		LongestSubString obj=new LongestSubString();
		Scanner in = new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		
		for(int i=0;i<str.length();i++)
		{
			int id=0;
			id=str.indexOf(str.charAt(i),i+1);
				if(id==-1)
					obj.isLong(str.substring(i, str.length()));
				else
					obj.isLong(str.substring(i, id));
		}
			
		System.out.println("Given "+str+", the answer is "+obj.result+", with the length of "+obj.l);
	}
	
}
