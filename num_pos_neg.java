import java.util.*;
import java.io.*;
class num
{
	public static void main (String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		if(a<0)
        	System.out.println("negative");
    		else if(a>0)
        	System.out.println("positive");
       	 	else
        	System.out.println("zero");
	}
}