// Replace all 0’s with 1 in a given integer by using Integer to String conversion

import java.util.Scanner;
public class Replace0to1
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        String str = Integer.toString(number);
        int len = str.length();
        String str1 = "";
        for (int i = 0; i < len; i++)
        {
            if(str.charAt(i) == '0')
            {
                str1 = str1 + '1';  // if number is 0 then replace with '1'
            }
            else
            {
            str1 = str1 + str.charAt(i);
            }
        }
        System.out.print("Converted Number : " +str1);
    }
}
