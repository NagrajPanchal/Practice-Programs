// Maximum number of handshakes

import java.util.Scanner;
public class MaximumHandshakes
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number of Peoples : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int handshakes = (num * (num - 1)) / 2; // Combination nc2 = (n*(n-1))/2
        System.out.print("For '"+ num +"' people there will be '" +handshakes+"' handshakes\n");
    }
}
