// Factorial_Number
// input 5 ----> 120 (5*4*3*2*1)

import java.util.Scanner;
public class Factorial_Number
{
    public static void main (String[]args)
    {
        int num, fact = 1;
        System.out.print("Enter the Nth Fibonacci Series of Number : ");
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++)
        {
            fact=fact*1;
        }
        System.out.println("Factorial : "+fact);
    }
}