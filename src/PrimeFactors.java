// Find the Prime Factors

import java.util.Scanner;
public class PrimeFactors
{
    public static void main(String[] args)
    {
        System.out.print("Enter the Number : ");
        Scanner obj = new Scanner (System.in);
        int n = obj.nextInt();
        System.out.print("Prime Factors : ");
        for (int i = 2; i<n; i++)
        {
            while (n % i == 0)
            {
                System.out.print(i+ ", ");
                n /= i;
            }
        }
        if (n > 2)
        System.out.print(n);
    }
}
