import java.util.Scanner;

public class StrangeCounter {
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.close();
		int val=3;
		int ref=val;
		for(int i=1;i<=t;i++)
		{
			if(i==t)
				break;
			if(val==1)
			{
				val=ref*2;
				ref=val;
				}
			else
				val--;
		}
		System.out.println(val);
	}
}
