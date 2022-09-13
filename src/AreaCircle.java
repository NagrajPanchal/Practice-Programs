// calculate area of a circle
import java.util.Scanner;
public class AreaCircle
{
    public static void main(String[] args)
    {
        System.out.print("Enter Radius : ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = 3.14 * (radius * radius);
        System.out.print("Area of the Circle : " +area+ "\n");
    }
}
