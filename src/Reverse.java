// Reverse Number

import java.util.Scanner;

public class Reverse
{
    public static void main (String[]args)
    {

        //variables initialization
        int reverse = 0, rem;
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse *  10 + rem;
            num /= 10; // num = num / 10
        };
        System.out.println ("Reversed Number: " + reverse);
    }
}