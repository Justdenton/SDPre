// For loop adds numbers 1-20 and displays the final sum.


public class Objective8Lab2 {
	public static void main(String[] args) {
		
		// Below initializes currentSum, MUST do outside of the for loop.
		int currentSum = 0;

		for (int controlVar = 1; controlVar <= 20; controlVar ++) {
			currentSum = currentSum + controlVar;
		}

		System.out.println(currentSum);
	
	}

}
