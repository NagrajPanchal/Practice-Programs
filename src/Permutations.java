// Permutations in which n people can occupy r seats in a classroom

import java.util.Scanner;
public class Permutations
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number of Peoples n : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("Enter Number of Seats r : ");
        int r = scanner.nextInt();
        int npr,number,fact1=1,fact2=1;
        // npr = n!/(n-r)!
        for(int i=n; i>1; i=i-1)
        {
            fact1 = fact1 * i;  //n! factorial
        }
        number = n - r; // (n-r)
        for(int i=number; i>1; i=i-1)
        {
            fact2 = fact2 * i; // (n-r)! factorial
        }
        npr = fact1 / fact2; // npr = n!/(n-r)!
        System.out.print("'"+n+"' peoples '"+r+"' seats '"+npr+ "' Ways can occupies in a classroom");
    }
}
