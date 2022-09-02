// Fibonacci_Series_Nth_Terms

import java.util.Scanner;
public class Fibonacci_Series_Nth_Terms
{
    public static void main (String[]args)
    {
        int term, a = 0, b = 1, nextTerm;
        System.out.print("Enter the Nth Fibonacci Series of Number : ");
        Scanner sc = new Scanner (System.in);
        term = sc.nextInt();
        for (int i = 0; i < term; i++)
        {
            System.out.print(a + " ");
            nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}