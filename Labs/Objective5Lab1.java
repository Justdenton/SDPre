public class Objective5Lab1 {
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 15;

    // Program compares 2 numbers. Output is dependent on which condition is true.
    // Since program uses else if and variables, will remain correct if variable values should change. (rather than strings)
  
    if(num1 > num2) {
      System.out.println(num1 + " is greater than " + num2); 
    }  
    else if(num2 > num1) {
      System.out.println(num2 + " is greater than " +num1);
    }
  }
}