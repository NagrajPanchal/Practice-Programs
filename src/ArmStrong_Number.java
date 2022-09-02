// ArmStrong number

import java.util.Scanner;
public class ArmStrong_Number
{
    public static void main (String[]args)
    {
        int num,arm=0,rem,c;
        System.out.print("Enter any Number : ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        c=num;
        while (num>0)
        {
            rem=num%10;
            arm=(rem*rem*rem)+arm;
            num=num/10;
        }

        // check if Armstrong
        if (c==arm)
            System.out.println(c + " is ArmStrong");
        else
            System.out.println(c + " is Not ArmStrong");
    }

}
