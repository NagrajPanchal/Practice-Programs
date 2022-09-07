// Perfect Square

import java.util.Scanner;
public class PerfectSquare
{
    public static void main(String[] args)
    {
    int flag = 0,num,i,square=0,result=0;
        System.out.print("Enter any Number : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        for (i = 1; i<=num; i++)
        {
            if (num == i*i)
            {
                flag=1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println(+i+ "^2 = " +num+" is a Perfect Square ");
        }
        else
        {
            System.out.println("Not a Perfect square");
        }
    }
}
