// Automorephic Number
import java.util.Scanner;
public class AutomorephicNumber
{
    public static void main(String[] args)
    {
        int p=0,digit=10,squar,num;
        System.out.print("Enter any Number : ");
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();
        squar = num * num;
        while (p<num)
        {
            p=squar%digit;
            digit=digit*10;
        }
        if (p==num) // When Squared you get the last digits is present in squared last number
            System.out.println(num+" is Automorphic Number"); // 5,25,6,376 are Automorphic numbers
        else System.out.println(num+" is not a Automorphic Number");

    }
}
