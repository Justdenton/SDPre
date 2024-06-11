// Sums up numbers, starts with 1, ends with 20.

public class Objective7Lab4 {
	public static void main(String [] args) {
		int count = 1;
		// Sum below to begin at 0, then increase within the while loop.
		int sum = 0;

		while(count <= 20) {
			sum = sum + count;
			count = count + 1;
		}
		
		// Prints ONLY the final sum.
		System.out.println(sum);
		
	}

}
