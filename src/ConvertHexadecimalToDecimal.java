// Convert Hexadecimal number to Decimal Number

public class ConvertHexadecimalToDecimal
{
    public static void main (String[]args)
    {

        String hex = "F";
        System.out.println("Hexadecimal Number : " +hex);
        System.out.print ("Decimal Number : " +convert (hex));
    }

    static int convert(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

}