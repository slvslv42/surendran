import java.util.Scanner;
import java.util.Arrays;

class SpiderWeb
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int numberOfElephants=in.nextInt();
		int maxCapacity=in.nextInt();
		int weights[]=new int[numberOfElephants];
		for(int i=0;i<numberOfElephants;i++)
			weights[i]=in.nextInt();
		Arrays.sort(weights);
		in.close();
		int count=0;
		int sum=0;
		for(int i=0;i<numberOfElephants;i++)
		{
			sum+=weights[i];
			if(sum>maxCapacity)
				break;
			count++;
		}
		System.out.println(count);
	}
}