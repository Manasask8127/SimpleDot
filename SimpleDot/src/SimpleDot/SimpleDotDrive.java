package SimpleDot;
public class SimpleDotDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGuess = "5";
		String result = dot.checkYourself(userGuess);

	}

}
