import java.util.Scanner;

public class IsSquare {
	
	static int sidelength=0;

	public static void main(String[] args) {
		 
		// array of (x,y) coordinates
		int xy[] = new int[8];
		
		 // user input 
		Scanner in = new Scanner(System.in);
		for(int i=0; i<8; i++)
			xy[i]=in.nextInt();
		in.close();
		
		/**
		 * for checking around the length comparing 'x' coordinates
		 */
		for(int i=0; i<8; i+=2) {
			for(int j=i+2; j<8; j+=2) {
				if(xy[i]==xy[j]) {
					if(i==0)
						sidelength=Math.abs(xy[i+1]-xy[j+1]);
					else {
						if(sidelength!=Math.abs(xy[i+1]-xy[j+1])) {
							System.out.println("Not square");
							System.exit(0);
						}
					}
				}
			}
		}
		
		/**
		 * for checking around the length comparing 'y' coordinates
		 */
		for(int i=1; i<8; i+=2) {
			for(int j=i+2; j<8; j+=2) {
				if(xy[i]==xy[j]) {
						if(sidelength!=Math.abs(xy[i-1]-xy[j-1])) {
							System.out.println("Not square");
							System.exit(0);
					}
				}
			}
		}
		System.out.println("square");
	}
}
