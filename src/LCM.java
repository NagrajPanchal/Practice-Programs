/* Least Common Divisor
LCM - (Least Common Divisor) : Smallest integer that is perfectly divisible by both number.
*/

import java.util.Scanner;
public class LCM
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number2 : ");
        int number2 = scanner.nextInt();
        int LCM = 0,GCD = 0;
        int min = (number1>number2) ? number2 : number1;
        for(int i=1; i<=min; i++)
        {
            if (number1 % i == 0 && number2 % i == 0)
                GCD = i;
        }
        LCM = (number1*number2)/GCD;
        System.out.println("LCM is : " +LCM);
    }
}
