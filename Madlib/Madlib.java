import java.util.Scanner;

public class Madlib
{
  public static void main(String[] args)
  {
    // creates a scanner to process terminal input
    Scanner sc = new Scanner(System.in);

   
    int index;

    int indexII;

String place = "";



    String one = "Bocchi the Rock is an amazing <type of production> featuring <name of a famous person>, as the main character, <name>!!";
    while (one.substring(0).indexOf("<") != -1) {
    index = one.indexOf("<");
    indexII = one.indexOf(">");

    System.out.println("Gimmie a " + one.substring(index + 1, indexII));
    place = sc.nextLine();

    one = one.substring(0, index) + place +" "+ one.substring(indexII+2);
    }
    //========================================================

    String tt = "I made a <type of production> where you <verb> <food dish (plural)> for profit.";
    while (tt.substring(0).indexOf("<") != -1) {
    index = tt.indexOf("<");
    indexII = tt.indexOf(">");

    System.out.println("Gimmie a " + tt.substring(index + 1, indexII));
    place = sc.nextLine();

    tt = tt.substring(0, index) + place +" "+ tt.substring(indexII+2);
    }
    //=============================================================
    
    String stupidthing = "In the downtown of <city name>, there lived a once famous celebrity. <name> was their name, and they ran a <food dish> kitchen, giving free <food dish> to the <name of a type of people> of <city name>. In all this goodness, though, <name (same from before)> had a dark side, because they was in cahoots with the <name of an organization>. Every <number> days, under the cover of the night, <name> would send out goons <verb (infinitive)> <type of building (plural)> and take <noun (plural)> and <another noun (plural)>! Not only that, whenever <name (same guy from before)> found out there was a <type of occupation> that <\"-ed\" verb> with business, he would take the <type of occupation> and <verb> him into the street to be <another \"-ed\" verb>. When the celebrity finally got <one more \"-ed\" verb> for <type of crime>, he was sent to <place>, for <another number> years. At least the <food dish (from before)> was good though.";
    while (stupidthing.substring(0).indexOf("<") != -1) {
    index = stupidthing.indexOf("<");
    indexII = stupidthing.indexOf(">");

    System.out.println("Gimmie a " + stupidthing.substring(index + 1, indexII));
    place = sc.nextLine();

    stupidthing = stupidthing.substring(0, index) + place +" "+ stupidthing.substring(indexII+2);
    

    //debug======================

  }
  System.out.println(one);
  System.out.println();
  System.out.println(tt);
  System.out.println();

    System.out.println(stupidthing);

    //IT WOOOOOOOOOOOOOOOOOOOOOOOOOOORKSSSSS
  }
}
    
//Make a var that is the product,
//make like 5 memory vars to store reused words



























/* 
    // prompts the user so they know when 
    // to enter keyboard input within a program
    System.out.println("Gimmie a food dish of some kind: ");
    String food = sc.nextLine();

    System.out.println("Gimmie the name of a place: ");
    String place = sc.nextLine();


    System.out.println("Gimmie the name of a city: ");
    String city = sc.nextLine();

    System.out.println("Gimmie a name of a person: ");
    String dude = sc.nextLine();

    System.out.println("Gimmie the name of an organization (full title): ");
    String gang = sc.nextLine();


    System.out.println("Gimmie a verb (past tense \"-ed verb\"): ");
    String edverbI = sc.nextLine();

    System.out.println("Gimmie another verb (past tense \"-ed verb\"): ");
    String edverbII = sc.nextLine();

    System.out.println("Gimmie one more verb (past tense \"-ed verb\"): ");
    String edverbIII = sc.nextLine();

    System.out.println("Gimmie another verb (infinitive \"to\" verb): ");
    String toverbI = sc.nextLine();

    System.out.println("Gimmie another verb (infinitive \"to\" verb): ");
    String toverbII = sc.nextLine();

    System.out.println("Gimmie an adverb: ");
    String adverbI = sc.nextLine();
    //====================================================================//
    //============ARRAY=THING====================================================//
    String[] beanbag = {food, place, city, dude, gang, edverbI, edverbII, edverbIII, toverbI, toverbII, adverbI};
    //===========================================================================//
    for (int i = 0; i < beanbag.length; i++) {
        System.out.println("Testing: " + beanbag[i]);
    }
  */  
    

