import java.util.Scanner;
import java.util.Random;
public class RandomGuess {
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        Random rand = new Random();
        int rand_pick = rand.nextInt(10) + 1;
        int choice;


        System.out.println("Please pick a number betweet 1 and 10 >>>>");
        choice = input.nextInt();

        if (choice == rand_pick)
        {
            System.out.println("Congratulations you are a good guesser.");
        }
        else if (choice > rand_pick)
        {
            System.out.println("Nope is was lower");
        }
        else if(choice < rand_pick)
        {
            System.out.println("Nope it was higher");
        }
        else
        {
            System.out.println("Nope it was "+ rand_pick);
        }
    }
}
