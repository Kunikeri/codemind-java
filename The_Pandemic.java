import java.util.Scanner;
public class Pandemic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3)
        {
            System.out.println(n-1);
        }
        else
        {
            System.out.println("2");
        }
        sc.close();
    }
}