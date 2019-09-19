package Assignment;

import java.util.Scanner;

public class AscedingAndDescending {
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int entry1;
        int entry2;
        int entry3;
        String result;
        String result1;

        System.out.println("Please enter 1 number");
        entry1 = input.nextInt();
        System.out.println("Please enter 1 number");
        entry2 = input.nextInt();
        System.out.println("Please enter 1 number");
        entry3 = input.nextInt();

        if (entry1 > entry2 && entry1 > entry3)
        {
            if (entry2 > entry3)
            {
                result = "Ascending order" + entry1 + " " + entry2 + " " + entry3;
                result1 = "Descending order " + entry3 + " " + entry2 + " " + entry1;
            }
            else
            {
                result = "Ascending order " + entry1 + " " + entry3 + " " + entry2;
                result1 = "Descending order " + entry3 + " " + entry1 + " " + entry2;
            }
            System.out.println("The result is " + result + "\n" + result1);
        }
        else if (entry2 > entry1 && entry3 > entry1)
        {
            if (entry3 > entry2) {
                result = "Ascending order " + entry3 + " " + entry2 + " " + entry1;
                result1 = "Descending order " + entry1 + " " + entry2 + " " + entry3;
            }
            else {
                result = "Ascending order " + entry3 + " " + entry1 + " " + entry2;
                result1 = "Descending order " + entry2 + " " + entry1 + " " + entry3;
            }
            System.out.println("The result is" + result + "\n" + result1);
            }

        else if (entry2 > entry3 && entry3 > entry1) {
            if (entry1 < entry2) {
                result = "Ascending order " + entry2 + " " + entry3 + " " + entry1;
                result1 = "Descending order " + entry1 + " " + entry3 + " " + entry2;
            }
            else
                {
                result = "Ascending order " +entry1 + " " +entry2 + " " +entry3;
                result1 = "Descending order "+ entry3 + " "+ entry2 + " "+ entry1;
            }
            System.out.println("The result is " + result + "\n" + result1);
        }




    }
}
