import java.util.Scanner;

public class Madlib
{
  public static void main(String[] args)
  {
    // creates a scanner to process terminal input
    Scanner sc = new Scanner(System.in);
    
    String dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee = "In the downtown of <city name>, there lived a once famous celebrity. <proper noun> was their name, and they ran a <food dish> kitchen, giving free <food dish> to the <name of a type of people> of <city name>. In all this goodness, though, <name> had a dark side, because they was in cahoots with the <name of an organization>. Every <number> days, under the cover of the night, <name> would send out goons <verb (infinitive)> <type of building> and take <noun> and <another noun>! Not only that, whenever <name> found out there was a <type of occupation> that <\"-ed\" verb> with business, he would take the <type of occupation> and <verb> him into the street to be <another \"-ed\" verb>. When the celebrity finally got <one more \"-ed\" verb> for <type of crime>, he was sent to <place>, for <another number> years. At least the <food dish> was good though.";
    String product    = "";
    String miniRamI   = "";
    String miniRamII  = "";
    String miniRamIII = "";
    String miniRamIV  = "";
    String miniRamV   = "";
    int deez = 1;
    String prompt = "";

    for (int i = 0; i < dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.length(); i++) {
        if (compareTo(dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.substring(i, i+1), "<") == 0) {
            prompt = "";
            deez = 1;
            //---------------------------debug
            System.out.println("huidai");
            //--------------------------
            while (dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.substring(i+1, i+2) != ">") {
                product = product + dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.substring((i+deez), (i+deez+1));
                //---------------------------debug
                System.out.println("bfjkvb");
                //--------------------------
                deez++;
                if (dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.substring(i+1, i+2) == ">") {
                  break;
                }
            }
            System.out.println("Gimmie a " + prompt + ":");
            String place = sc.nextLine();

        } else {
          System.out.print(dumbwayofdoingmadlibstuffispentsomuchtimeintotheotheroneeeeeee.substring(i, i+1) + " ");
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
    
  }
}
