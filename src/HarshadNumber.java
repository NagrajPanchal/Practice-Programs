//Harshad Number

public class HarshadNumber {
    public static void main(String[] args)
    {
        int n = 47;
        int result = 0;
        while(n != 0)
        {
            int pickLast = n % 10;
            result = result + pickLast;
            n = n / 10;
        }
		/*use condition to check whether the number entered by
		user is completely divisible by its sum of digits or not*/
        if(n % result == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}