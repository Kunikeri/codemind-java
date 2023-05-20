import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float s=(float)3.14*n*n;
        System.out.format("%.2f",s);
    }
}