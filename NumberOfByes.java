import java.util.Scanner;

public class NumberOfByes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Number of players : ");
		int numberOfPlayers = in.nextInt();
		in.close();
		
		/**
		 * if only one player
		 */
		if(numberOfPlayers==1) {
			System.out.println("Number of byes : "+0);
			System.exit(0);
		}
		
		int i=1;
		while(true) {
			
			/**
			 * if number of players is power of 2
			 */
			if(i*2 == numberOfPlayers) {
				System.out.println("Number of byes : "+0);
				System.exit(0);
			}
			
			/**
			 * if number of players is not power of 2
			 */
			if(i*2 > numberOfPlayers)
				break;
			i*=2;
		}
		
		int numberOfByes = numberOfPlayers-((numberOfPlayers-i)*2);
		System.out.println("Number of byes : "+numberOfByes);
	}

}
