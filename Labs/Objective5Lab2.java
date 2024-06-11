public class Objective5Lab2 {
  public static void main(String[] args) {
    String string1 = "Banana";
    String string2 = "Bacon";
    String string3 = "Banana";

    // Program determines if string1 is EQUIVALENT to string3.
    // Output to include both code blocks, 2 if/else

    if(string1.equals(string2)) {
      System.out.println(string1 + " is equivalent to " + string2);
    } else {
      System.out.println(string1 + " is not equivalent to " + string2);
    }
    if (string1.equals(string3)) {
      System.out.println(string1 + " is equivalent to " + string3);
    } else {
      System.out.println(string1 + " is not equivalent to " + string3);
    }

    // Need to always remember to add spaces before and after print string.
    
  }
}