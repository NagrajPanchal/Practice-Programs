// number of digits in an integer

import java.util.Scanner;
public class DigitsNumbersInteger
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        long num = scanner.nextLong();
        long count = 0,digit;
        while(num != 0)
        {
            digit = num %10;
            count++;
            num = num /10;
        }
        System.out.print("Number of Digits : "+count);

    }
}
