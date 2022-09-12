// Convert Decimal number to Octal number

import java.util.Scanner;
public class ConvertDecimalToOctal
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal = scanner.nextInt();
        int octal[] = new int[20];
        int i = 0;
        while (decimal > 0)
        {
            int rem = decimal % 8;
            octal[i++] = rem;
            decimal = decimal/8;
        }
        System.out.print("Octal Number : ");
        for (int j = i-1; j>= 0; j--)
            System.out.print(octal[j] + "");
    }
}
