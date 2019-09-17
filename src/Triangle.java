import java.util.Scanner;
public class Triangle {
    public static void main (String []args)
    {
        int choice;
        Scanner input = new Scanner (System.in);
        System.out.println("What are you solving for? \n 1 - for right triangle \n"+
    "2- for Isosceletes / 3- for equilateral \n Choice>>>>>>");
        choice = input.nextInt();
        if (choice == 1)
        {
            rightTriangle();
        }
        else if (choice == 2)
        {
            Equilateral();
        }
        else if (choice == 3)
        {

            solveArea();
        }
        else
        {
            System.out.println("NOT AN OPTION");
        }
    }
    public static void rightTriangle()
    {
        Scanner input = new Scanner(System.in);
        String choice;
        double side1;
        double side2;

        System.out.println("What side do you want to solve for\n"+
        "A - side\nB - side \n c - side");
        choice = input.next();
        if (choice.equalsIgnoreCase("A"))
        {
        System.out.print("Please enter for side B >>>>>>");
        side1 = input.nextDouble();
        System.out.print("Please enter for side C>>>");
        side2 = input.nextDouble();
        rightTriangleMathAB(side1,side2,choice);
        }
        else if (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B"))
        {
            System.out.print("Please enter for side a >>>>>>");
            side1 = input.nextDouble();
            System.out.print("Please enter for side C>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
        else
        {
            System.out.print("Please enter for side A >>>>>>");
            side1 = input.nextDouble();
            System.out.print("Please enter for side B>>>");
            side2 = input.nextDouble();
            rightTriangleMathAB(side1, side2, choice);
        }
    }
    public static void rightTriangleMathAB(double side1, double side2, String choice)
    {
        double notC;
        notC = Math.sqrt((side2 * side2) - (side1 * side1));
        System.out.println("The side " + choice + " is " + notC);

    }
    public static void Equilateral()
    {
        Scanner input = new Scanner(System.in);
        double A;
        double B;
    System.out.println("What is side A");
    A = input.nextInt();
    System.out.println("HEY whats side B");
    B = input.nextInt("");
    }
    public static void solveArea()
    {

    }

}
