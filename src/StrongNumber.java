// Strong Number

import java.util.Scanner;
public class StrongNumber
{
    public static void main(String[] args)
    {
        System.out.print("Enter any number : ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int sum= 0,num=n,digit;
        while(n>0)
        {
            int fact=1;
            digit = n % 10;
            for (int i = 1; i<=digit; i++)
            {
                fact= fact * i;
            }
            sum = sum + fact;
            n /= 10;
        }
        if (num == sum)
        {
            System.out.println(num+" Strong Number"); //40585
        }
        else {
            System.out.println(num+" Not a strong number");
        }
    }
}
