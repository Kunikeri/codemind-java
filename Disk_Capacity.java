import java.util.Scanner;
public class DiskCapacity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
            int t,s,b,c;
            t=sc.nextInt();
            s=sc.nextInt();
            b=sc.nextInt();
            c=2*t*s*b*512;
            System.out.println(c);
            sc.close();
    }
}