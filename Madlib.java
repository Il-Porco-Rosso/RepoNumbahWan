import java.util.Scanner;

public class Madlib
{
  public static void main(String[] args)
  {
    // creates a scanner to process terminal input
    Scanner sc = new Scanner(System.in);
    
    // prompts the user so they know when 
    // to enter keyboard input within a program
    System.out.println("Gimmie a noun: ");
    
    // nextLine method returns all keyboard input
    // until the user presses the Return or Enter key
    String nounI = sc.nextLine();

    System.out.println("Gimmie another noun: ");
    String nounII = sc.nextLine();


    System.out.println("Gimmie a name: ");
    String dudeI = sc.nextLine();

    System.out.println("Gimmie another name: ");
    String dudeII = sc.nextLine();


    System.out.println("Gimmie a verb: ");
    String verbI = sc.nextLine();

    //====================================================================//
    // after collecting input, you can treat user input
    // as a normal String value
    System.out.println("Your value was: " + nounI);
    
  }
}