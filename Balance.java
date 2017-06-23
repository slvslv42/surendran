import java.util.Scanner;

class Balance
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int sum=0;
		int[] cost=new int[n];
		for(int i=0;i<n;i++)
		{
			cost[i]=in.nextInt();
			if(i!=k)
				sum+=cost[i];
		}
		int annaPaid=in.nextInt();
		if((sum/2)==annaPaid)
			System.out.println("Bon Appetit");
		else
			System.out.println(annaPaid-(sum/2));
		in.close();
		
	}
}
