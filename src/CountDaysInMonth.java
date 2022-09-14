// Count Number of Days in a Month fo a Year

import java.util.Scanner;
public class CountDaysInMonth
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Month : ");
        int month = scanner.nextInt();
        System.out.print("Enter Year : ");
        int year = scanner.nextInt();
            if( month==2 && ((year%4==0)||((year%100==0) && (year%400==0))))
                System.out.println("Number of days 29");
            else if (month==2)
                System.out.println("Number of days 28");
            else if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
                System.out.println("Number of days 31");
            else
                System.out.println("Number of days 30");
    }
}
