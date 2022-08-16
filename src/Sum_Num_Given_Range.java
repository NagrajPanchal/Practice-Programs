import java.util.Scanner;

public class Sum_Num_Given_Range
{
    public static void main(String[] args) {
        int number1,number2;
        System.out.println("Enter which numbers to start to Sum from Number1 : ");
        Scanner in = new Scanner(System.in);
        number1 = in.nextInt();
        System.out.println(+number1+ " to end Sum of Given Range enter Number2 : ");
        number2 = in.nextInt();
        int sum = number2*(number2+1)/2 - number1*(number1+1)/2 + number1;
        System.out.println("The Given range is " +number1+ " to " +number2+ " Total Sum is : "+ sum);
    }
}
