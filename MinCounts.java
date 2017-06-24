import java.util.Scanner;
public class MinCounts {
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Number of test case : ");
		int n=in.nextInt();
		int arr[][]=new int[n][2];
		System.out.println("M  N");
		for(int i=0;i<n;i++)
			for(int j=0;j<2;j++)
				arr[i][j]=in.nextInt();
		in.close();
		int cuts[]=new int[n];
		for(int i=0;i<n;i++)
		{
			cuts[i]=arr[i][0]-1;				//row-1
			cuts[i]+=((arr[i][1]-1)*arr[i][0]);	//(column-1)*row
		}
		for(int i=0;i<n;i++)
			System.out.println(cuts[i]);
	}
}
