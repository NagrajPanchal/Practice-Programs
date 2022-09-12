// Quadrants coordinats

import java.util.Scanner;
public class Quadrants
{

    public static void main (String[] args)
    {
        System.out.print("Enter X-axis : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Enter Y-axis : ");
        int y = scanner.nextInt();
        //find true condition of first quadrant
        if(x>0 && y>0)
            System.out.println("Quadrant I");
            //find second quadrant
        else if(x<0 && y>0)
            System.out.println("Quadrant II");
            //To find third quadrant
        else if(x<0 && y<0) System.out.println("Quadrant III");
            //To find Fourth quadrant
        else if (x > 0 && y < 0)
            System.out.println("Quadrant IV");
            //To find dose not lie on origin
        else if (x == 0 && y == 0)
            System.out.println("Origin");
            //On x-axis
        else if (y==0 && x!=0)
            System.out.println("x-axis");
            //On y-axis
        else if (x==0 && y!=0)
            System.out.println("y-axis");
    }
}
