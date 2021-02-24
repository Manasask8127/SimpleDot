package Game;
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame()
	{
		p1=new Player();
		p2=new Player();
		p3=new Player();
	
		int guess1=0;
		int guess2=0;
		int guess3=0;
		
		boolean rightp1=false;
		boolean rightp2=false;
		boolean rightp3=false;
		
		int target=(int) (Math.random()*10);
		System.out.println("I'm thinking from 0-9.....");
		
		while(true)
		{
			System.out.println("The number to guess is.... "+target);
		
			p1.guess();
			p2.guess();
			p3.guess();
			
			
			if(p1.number==target)
				rightp1=true;
			if(p2.number==target)
				rightp2=true;
			if(p3.number==target)
				rightp3=true;
			
			
			if(rightp1 || rightp2 || rightp3)
			{
				System.out.println("We found the winner");
				System.out.println("One? "+rightp1);
				System.out.println("Two? "+rightp2);
				System.out.println("Three? "+rightp3);
				System.out.println("Game Over! ");
				break;
			}
			else
				System.out.println("Play again! ");
			
		}
	}
	
	

}
