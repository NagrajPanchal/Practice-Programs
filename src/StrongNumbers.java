// Strong Numbers Series

public class StrongNumbers
{
    public static void main(String[] args)
    {
        int n = 200;
        int sum= 0,num=n,digit;
        String  strongNumbers = "";
        while(n>0)
        {
            int fact=1;
            int counter=0;
            digit = n % 10;
            for (int i = 1; i<=digit; i++)
            {
                fact= fact * i;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    strongNumbers = strongNumbers + i + " ";
                }
            }
            sum = sum + fact;
            n /= 10;
        }
        System.out.println(strongNumbers);
    }
}
