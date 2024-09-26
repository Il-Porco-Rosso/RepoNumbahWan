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


    System.out.println("Gimmie the name of a city: ");
    String city = sc.nextLine();

    System.out.println("Gimmie a name of a person: ");
    String dudeI = sc.nextLine();

    System.out.println("Gimmie another name: ");
    String dudeII = sc.nextLine();


    System.out.println("Gimmie a verb (in the infinitive, ex: \"to do\", plz dont do that): ");
    String verbI = sc.nextLine();

    System.out.println("Gimmie another verb (in the infinitive): ");
    String verbII = sc.nextLine();

    System.out.println("Gimmie an adverb: ");
    String adverbI = sc.nextLine();
    //====================================================================//
    //============ARRAY=THING====================================================//
    String[] listofmodifyerthingies = {nounI, nounII, city, dudeI, dudeII, verbI, verbII, adverbI};
    //===========================================================================//
    for (int i = 0; i < listofmodifyerthingies.length; i++) {
        System.out.println("Testing: " + listofmodifyerthingies[i]);
    }
    
    
  }
}