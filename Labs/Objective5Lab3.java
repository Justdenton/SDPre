import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      /* 
      Program promps user for a number and determines if the number
      is greater than, less than, or equal to 0.
      */

      System.out.println("Please enter a number: ");
      userNum = scanner.nextInt();

      if (userNum > 0) {
        System.out.println("The number is positive");
      } else if (userNum < 0) {
        System.out.println("The number is negative");
      } else {
        System.out.println("The number is zero");
      }

      scanner.close();
  }
}
