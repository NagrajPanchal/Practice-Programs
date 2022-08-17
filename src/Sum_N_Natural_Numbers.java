//Sum of N Natural Numbers

import java.util.Scanner;

public class Sum_N_Natural_Numbers
{
    public static void main (String[]args)
    {

        System.out.println("Enter how many numbers you want to Sum from 0 to .....");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println ("Sum of N Natural Number total : " +n*(n+1)/2);
    }
}

/*
n =5
n+1 = 5+1 = 6
        (n+1)/2 = 6/2 =3
n*(n+1)/2 = 5*3 = 15
*/
