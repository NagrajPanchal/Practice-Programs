import java.util.Scanner;

public class Number_3_Equals
{
    public static void main (String[]args)
    {

        int number1,number2;
        System.out.println("Enter any Number1 : ");
        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        System.out.println(+number1+ " to compare enter Number2 : ");
        number2 = in.nextInt();

        if (number1 == number2)
            System.out.println (+number1+ " & " +number2 +" Both are equal");
        else if (number1 > number2)
            System.out.println (number1 + " is Greater");

        else
            System.out.println (number2 + " is Greater");

    }
}
