import java.util.Scanner; 
class AlexClass
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		String awake=in.next();
		int id[]=new int[k];
		n=0;
		for(int i=0;i<k;i++)
		{
			id[i]=in.nextInt();
			if(awake.charAt(id[i]-1)=='0')
			{
				n=1;
			}
		}
		in.close();
		if(n==0)
			System.out.print("NO");
		else
			System.out.print("YES");
	}
}