/*checking whether the number is even or odd*/

import java.util.Scanner;
public class Num_Even_Odd
{
    public static void main(String[] args) {
        int number;
        System.out.println("Enter any number");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is Odd");
    }
}
