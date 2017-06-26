import java.util.Random;

public class SubSequentCoin {

	public static void main(String[] args) {
		int a[]={1,2,5};
		Random ran = new Random();
		int x = ran.nextInt(14) +2 ;
		int player1=0;
		int player2=0;
		for(int i=0;i<x;i++)
		{
			int in = ran.nextInt(3) +0 ;
			if(i%2==0)
				player1+=a[in];
			else
				player2+=a[in];
		}
		System.out.println("Player 1 : "+player1+"\nPlayer 2 : "+player2);
	}

}
