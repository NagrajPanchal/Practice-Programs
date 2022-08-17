import java.util.Scanner;

public class Number_3_Equals
{
    public static void main (String[]args)
    {

        int number1,number2,number3;
        System.out.println("Enter any Number1 : ");
        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        System.out.println(+number1+ " to compare enter Number2 : ");
        number2 = in.nextInt();
        System.out.println(+number1+ ","+number2+ " to compare enter Number3 : ");
        number3 = in.nextInt();

        if (number1 == number2 && number1 == number3) //checking if all numbers are equals
            System.out.println (" All are equal");

        else if (number1 >= number2 && number1 >= number3) //checking if number1 is greatest
            System.out.println (+number1+ " is Greater");

        else if (number2 >= number1 && number2 >= number3) //checking if number2 is greatest
            System.out.println (number2 + " is Greater");

        else if (number3 >= number1 && number3 >= number2) //checking if number3 is greatest
            System.out.println (number3 + " is Greater");

    }
}
