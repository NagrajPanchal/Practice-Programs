// finding and printing factors b/w 1 to num

import java.util.Scanner;

public class Factor_Numbers
{
    public static void main(String[] args) {

        System.out.println("Enter the Factors Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println( "Factors of " + num + " are " );

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                System.out.println(i + " ");
        }

    }
}