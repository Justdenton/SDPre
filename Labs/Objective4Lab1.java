import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //Prompt and store.

    // Prompt first name
    System.out.println("What is your first name?");
    String fname = keyboard.nextLine();

    // Prompt last name
    System.out.println("What is your last name?");
    String lname = keyboard.nextLine();

    // Prompt favorite animal
    System.out.println("What is your favorite animal?");
    String favoriteAnimal = keyboard.nextLine();

    // Prompt favorite food
    System.out.println("What is your favorite food?");
    String favoriteFood = keyboard.nextLine();

    // Prompt favorite song
    System.out.println("What is your favorite song?");
    String favoriteSong = keyboard.nextLine();


    // Print variables with My prefix
    // Unsure if the S in Star should output as capitalized, the entered text for the favorite song prompt had a lowercase S entered.
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");

    keyboard.close(); // Close the scanner (can NO LONGER receive data)
  }
}
