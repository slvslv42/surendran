import java.util.Scanner;
import java.util.TreeSet;

public class IsPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String given = in.nextLine();
		in.close();
		TreeSet<Character> list = new TreeSet<Character>();
		for(int i=0; i<given.length(); i++) {
			if(given.charAt(i)!=' ') {
				list.add(given.charAt(i));
			}
		}
		if(list.size()!=26)
			System.out.println("Not an Panagram");
		else
			System.out.println("Is an Panagram");
	}

}
