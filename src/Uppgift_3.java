import java.util.Random;
import java.util.Scanner;

public class Uppgift_3 {
    public static void main(String[] args) {
        // En kommentar på en rad
        /*
        En kommentar som sträcker
        sig
        över
        flera
        rader.
         */

        /*
        1. Slumpa fram ett tal, spara det i en variabel.
        2. Fråga användaren om en gissning
        3. Om fel, skriv större eller mindre och gå till 2
         */

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int talet = rand.nextInt(1, 100);
        int gissning;
        do{
            System.out.println("Din gissning");
            gissning = sc.nextInt();

            if (gissning < talet) {
                System.out.println("För lågt");
            }
            if (gissning > talet) {
                System.out.println("För högt");
            }
            if (gissning == talet) {
                System.out.println("Rätt! Avslutar progammet...");
            }
        }while (gissning != talet);

    }
}


