import java.util.*;
import java.io.*;
class even_odd
{
	public static void main (String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a%2==0)
        	System.out.println("Even number");
    		else if(a%2!=0)
       	 	System.out.println("odd number");
	}
}