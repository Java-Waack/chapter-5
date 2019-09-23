package Assignment;

import java.util.Scanner;

public class CondoSales {
    public static void main (String [] args)
    {
int choice;
    Scanner input = new Scanner (System.in);
        {
            System.out.println("Choose your yard things \n 1 - Park view \n" +
                    "2- for Golf course view \n 3- for Lake views \n Choice>>>>>>");
            choice = input.nextInt();

            if (choice == 1)
            {
                double price = 150000;
                System.out.println("Your total is $"+ price);
            }
            if (choice == 2)
            {
                double price = 170000;
                System.out.println("Your total is $"+ price);
            }
            if (choice == 3)
            {
                double price = 210000;
                System.out.println("Your total is $"+ price);
            }
            else
                {
                    double price = 0;
                System.out.println("Your total is $"+ price);
            }
        }
    }

}
