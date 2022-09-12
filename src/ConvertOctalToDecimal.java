// Convert Octal Number to Decimal Number

import java.util.Scanner;
public class ConvertOctalToDecimal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Octal Number : ");
        int octal = scanner.nextInt();
        int decimal = 0;
        int num = 0;
        while (octal > 0)
        {
            int temp = octal % 10;
            decimal += temp * Math.pow(8,num);
            octal = octal/10;
            num++;
        }
        System.out.print("Decimal Number : " +decimal);
    }
}
