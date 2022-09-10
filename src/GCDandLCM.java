/* GCD and LCM
GCD - (Greatest Common Divisor) : Largest integer that Can be exactly divides both number without any reminder.
LCM - (Least Common Divisor) : Smallest integer that is perfectly divisible by both number.
*/
import java.util.Scanner;

public class GCDandLCM
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter Number 1 : "); // 81 % 9 == 0
        int number1 = scanner.nextInt();
        System.out.print("Enter Number 2 : "); // 153 % 9 == 0
        int number2 = scanner.nextInt();
        int GCD = 0, LCM = 0;
        int min = (number1 > number2) ? number2 : number1;
        // min = if number1 > number 2 then number2 else number1
        for ( int i = 1; i<= min; i++)
        {
            if(number1 % i ==0 && number2 % i ==0)
            GCD = i;
        }
        System.out.println("GCD is : " +GCD);
        LCM = (number1*number2)/GCD; // (number1*number2) = GCD*LCM
        // 360 % 72 == 0 & 360 % 120 == 0
        System.out.println("LCM is : " +LCM);
    }
}


/* GCD(Greatest Common Divisor) or HCF(Highest Common Factor) of two numbers is the number which is the largest common factor of both numbers

 */