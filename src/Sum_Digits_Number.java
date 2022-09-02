// Sum of the Digits of a Number

import java.util.Scanner;
public class Sum_Digits_Number
{
    public static void main (String[]args)
    {
        System.out.print("Enter the numbers : ");
        int num, sum = 0;
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        //loop to find sum of digits
        while(num!=0){
            sum += num % 10;
            num /= 10;
        }
        System.out.println ("Sum of digits : " + sum);
    }
}
