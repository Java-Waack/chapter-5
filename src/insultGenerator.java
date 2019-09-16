import java.util.Scanner;

public class insultGenerator
{

    public static void main (String[] args)
    {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age");
        age = input.nextInt();


        if (age < 12) {
            System.out.println("You are a child you need to leave");
        }
        else if (age >= 12 && age < 19)
        {
            System.out.println("You are old enough to know better");
        }
        else if (age >= 19 && age < 25)
        {
            System.out.println("GET A JOB YOU BUM");
        }
        else if (age >= 25 && age < 35)
        {
            System.out.println("Jeez you need to hit the gym");
        }
        else if (age >= 35 && age < 45)
        {
            System.out.println("YOu need to take a shower bub");
        }
        else if (age >= 45 && age < 55)
        {
            System.out.println("Your a little old to be playing a game dont ya think?");
        }
        else if (age > 55)
        {
            System.out.println("Go watch your grandkids grandpa");
        }
    }
}
