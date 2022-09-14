// Occurrence of a digit in a given number

import java.util.Scanner;
public class OccurranceDigit
{
    public static void main(String[] args)
    {
    Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = scanner.nextInt();
        System.out.print("Enter digit : ");
        int digit = scanner.nextInt();
        int count = 0;
    while(num > 0)
    {
        int rem = num % 10;
        if(rem == digit)
            count++;
            num = num / 10;
    }
        System.out.println("Number of Times occurrence a digit : "+count);
    }
}
