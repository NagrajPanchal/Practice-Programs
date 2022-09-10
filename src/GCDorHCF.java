// Greatest Common Divisor or HCF - Highest Common Factor
import java.util.Scanner;
public class GCDorHCF
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number 2 : ");
        int number2 = scanner.nextInt();
        int GCD = 0;
        for (int i = 1; i <= number1 || i <= number2; i++)
        {
            if (number1 % i == 0 && number2 % i == 0)
                GCD = i;
        }
        System.out.println("GCD or HCF is : " +GCD);
    }
}
