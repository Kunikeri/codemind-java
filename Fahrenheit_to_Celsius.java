import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double f=(float)(n-32)*5/9;
        System.out.format("%.2f",f);
    }
}