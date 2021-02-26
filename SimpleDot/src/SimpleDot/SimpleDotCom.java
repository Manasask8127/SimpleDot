package SimpleDot;

public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locations) {
		// TODO Auto-generated method stub
		locationCells=locations;
		
	}

	

	String checkYourself(String userGuess) {
		// TODO Auto-generated method stub
		int guess = Integer.parseInt(userGuess);
		String result = "miss";
		for (int cell : locationCells) {
		if (guess == cell) {
		result = "hit";
		numOfHits++;
		break;
		}
		}
		if (numOfHits ==
				locationCells.length) {
				result = "kill";
				}
		System.out.println(result);
		
		return result;
		//return null;
	}

}
