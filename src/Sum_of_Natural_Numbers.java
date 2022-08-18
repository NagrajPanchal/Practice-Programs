import java.util.Scanner;

public class Sum_of_Natural_Numbers
{
public static void main(String[] args)
{
    int n;
    int sum=0;
    System.out.println("Enter any one Number");
    Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
    for (int i=1; i<=n; i++)
    {
        sum = sum + 1;
    }
    System.out.println(sum);
}
}
