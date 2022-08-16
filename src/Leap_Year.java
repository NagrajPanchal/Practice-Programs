//Check Leap Year or not

import java.util.Scanner;

public class Leap_Year
{
    public static void main (String[]args)
    {

        int year;
        System.out.println("Enter Year : ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println (year + " is a Leap Year");
        else
            System.out.println (year + " is not a Leap Year");

    }
}
