import java.io.*;
import java.util.*;
class even_odd
{
	public static void main (String[] args) throws Exception
	{
		Scanner s= new Scanner(System.in); 
		char a = s.next().charAt(0);
		if(a!='a'&&a!='e'&&a!='i'&&a!='o'&&a!='u')
		System.out.println("consonant");
		else 
        	System.out.println("vowel");
    	}
}