// Write a program to find the largest of three numbers in java
import java.util.Scanner;

public class Greatest_3_Numbers
{

        public static void main (String[]args)
        {

            int number1,number2,number3;
            System.out.println("Enter any Number1 : ");
            Scanner in = new Scanner(System.in);
            number1 = in.nextInt();
            System.out.println(+number1+ " to compare enter Number2 : ");
            number2 = in.nextInt();
            System.out.println(+number1+ "," +number2+ " & to compare enter Number3 : ");
            number3 = in.nextInt();
            //checking if number1 is greatest
            if (number1 >= number2 && number1 >= number3)
                System.out.println (+number1+ " is Greater");
                //checking if number2 is greatest
            else if (number2 >= number1 && number2 >= number3)
                System.out.println (number2 + " is Greater");
                //checking if number3 is greatest
            else
                System.out.println (number3 + " is Greater");


        }



}
