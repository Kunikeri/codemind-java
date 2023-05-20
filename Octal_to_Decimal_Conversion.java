import java.util.Scanner;
public class Conversion
{
    public static void main(String[]args)
    
    {
        Scanner sc=new Scanner(System.in);
        int octal=sc.nextInt();
        int decimal=convertOctalToDecimal(octal);
        System.out.println(decimal);
    }
    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber =0,i=0;
        while(octal!=0)
        {
            decimalNumber += (octal % 10) * Math.pow(8,i);
            ++i;
            octal/=10;
        }
        return decimalNumber;
    }
}