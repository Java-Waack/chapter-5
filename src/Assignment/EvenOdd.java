package Assignment;

import java.util.Scanner;

public class EvenOdd {


    //the user enter a number and it had to display even or odd as the result;
    public static void main (String [] args)
    {
        int numEntered;
        String result;
        Scanner input = new Scanner (System.in);
        numEntered = input.nextInt();


        if (numEntered % 2 == 0)
        {
            result = "Even";

        }
        else
            result = "Odd";
        System.out.println(result);
    }




}
