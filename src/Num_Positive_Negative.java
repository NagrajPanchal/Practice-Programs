import java.util.Scanner;

public class Num_Positive_Negative
{
    public static void main (String[]args)
    {
        int num;
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
                if (num > 0)
        {
            System.out.println("The number is Positive");
        }
        else if (num < 0)
        {
            System.out.println("The number is Negative");
        }
            else
        {
            System.out.println("The number is Zero");
        }
    }
}
