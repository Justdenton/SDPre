import java.util.Scanner;
import java.time.Year;

public class Objective4Lab3 {
  public static void main(String[] args) {
    
    // Program uses scanner and stores into age variable.
    // Program calculates what year the user was born in.
    // Program prints out the calculated birth year.

    // Declare integers (whole).
    int birthYear, age, currentYear;

    birthYear = 0;

    // Create scanner and prompt user for age.
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    // Save age input and get current year.
    age = input.nextInt();
    currentYear = Year.now().getValue();

    // Calculate birth year.
    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
    input.close();

  }
}