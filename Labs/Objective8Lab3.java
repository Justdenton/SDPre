// Prints out numbers 1-20, also prints whether each number is odd or even.

public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for (int controlVar = 1; controlVar <= 20; controlVar ++) {
      counter = controlVar;
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");
      } else {
        System.out.println(counter + " is odd");
      }
      
    }
    
  }

}
