// Convert Decimal Number to Bin ary Number

import java.util.Scanner;
public class ConvertDecimalToBinaryNumber
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal = scanner.nextInt();
        int binary[] = new int[20];
        int i = 0;
        while (decimal > 0)
        {
            int rem = decimal % 2;
            binary[i++] = rem;
            decimal = decimal/2;
        }
        System.out.print("Binary Number : ");
        for (int j = i-1; j >= 0; j--)
            System.out.print(binary[j]+ "");
    }
}
