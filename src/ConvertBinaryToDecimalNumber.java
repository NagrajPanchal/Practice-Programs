// Convert Binary to Decimal Number

import java.util.Scanner;
public class ConvertBinaryToDecimalNumber
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int Binary = scanner.nextInt();
        int num = 0;
        int decimal = 0;
        while (Binary > 0)
        {
            int temp = Binary%10;
            decimal += temp * Math.pow(2,num);
            Binary = Binary/10;
            num++;
        }
        System.out.print("Decimal Number : " +decimal);
    }
}
