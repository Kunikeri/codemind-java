import java.util.Scanner;
public class RainDrop
{
    public static void main(String args[])
    {
        int n;
        String Sound ="";
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%3==0)
        {
            Sound=Sound+"Pling";
        }
        if(n%5==0)
        {
             Sound=Sound+"Plang";
        }
        if(n%7==0)
        {
             Sound=Sound+"Plong";
        }
        if(Sound.isEmpty())
        {
             System.out.println(n);
        }
        else
        {
            System.out.println(Sound);
        }
        sc.close();
    }
}