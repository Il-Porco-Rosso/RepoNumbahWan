import java.util.Scanner;

public class Madlib
{
  public static void main(String[] args)
  {
    // creates a scanner to process terminal input
    Scanner sc = new Scanner(System.in);
    
    // prompts the user so they know when 
    // to enter keyboard input within a program
    System.out.println("Enter a number: ");
    
    // nextLine method returns all keyboard input
    // until the user presses the Return or Enter key
    String userInput = sc.nextLine();
    
    // after collecting input, you can treat user input
    // as a normal String value
    System.out.println("Your value was: " + userInput);
    
  }
}