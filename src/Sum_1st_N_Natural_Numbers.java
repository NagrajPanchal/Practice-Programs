//Sum of First N Natural Numbers

import java.util.Scanner;

public class Sum_1st_N_Natural_Numbers
{
    public static void main (String[]args)
    {

        int n;
        System.out.println("Enter how any numbers you want to Sum from 1 to .....");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println ("Sum of First N Natural Number total : " +n*(n+1)/2);
    }
}
