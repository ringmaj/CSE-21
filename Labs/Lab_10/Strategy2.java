package pig;

public class Strategy2 extends Player {
		
	int reroll = 0;
	
	public boolean throwAgain ( Player opponent ) {
		// this player randomly chooses whether to throw again or not
		reroll++;
		
		if (reroll < 7) {
			return true;
		}
		else{
			reroll = 0;
			return false;
		}
	}
}