// Addition of Two fractions numbers

import java.util.Scanner;
public class AdditionTwoFractions
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator for first fraction : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter denominator for first fraction : ");
        int den1 = scanner.nextInt();
        System.out.print("Enter numerator for second fraction : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter denominator for second fraction : ");
        int den2 = scanner.nextInt();
        int num, den, x;
        System.out.print("("+num1+" / "+den1+") + ("+num2+" / "+den2+") = ");
        //logic for calculating sum of 2 fractions
        if(den1 == den2)
        {
            num = num1 + num2 ;
            den = den1 ;
        }
        else{
            num = (num1*den2) + (num2*den1);
            den = den1 * den2;
        }
        if(num > den)
            x = num;
        else
            x = den;
        for(int i = 1 ; i <= x ; i++)
        {
            if(num%i == 0 && den%i == 0)
            {
                num = num/i;
                den = den/i;
            }
        }
        //logic for getting simplified fraction
        int n = 1;
        int p = num;
        int q = den;
        if( num != den)
        {
            while(n != 0)
            {
                //storing remainder
                n = num % den;
                if(n != 0)
                {
                    num = den;
                    den = n;
                }
            }
        }
        System.out.println("("+p/den+" / "+q/den+")");
    }
}
