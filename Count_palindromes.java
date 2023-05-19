import java.util.*;
public class Countpalindromes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int s[]=new int[n];
        int c=0,r;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
           while(a[i]!=0)
           {
               r=a[i]%10;
               s[i]=s[i]*10+r;
               a[i]=a[i]/10;
           }
           if(s[i]==b[i])
             {
                c++;
             }
           }
             {
                 System.out.println(c);
             }
    }
}